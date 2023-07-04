package com.example.hyebozabackend.domain.benefit.facade;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import com.example.hyebozabackend.domain.benefit.domain.repository.BenefitRepository;
import com.example.hyebozabackend.domain.benefit.domain.type.BenefitCategory;
import com.example.hyebozabackend.domain.benefit.domain.type.UserCategory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class BenefitFacade {

    private final BenefitRepository benefitRepository;

    public List<Benefit> execute(String userCategory, String benefitCategory) {
        if (Objects.equals(userCategory, " ")) {
            if (Objects.equals(benefitCategory, " ")) {
                return benefitRepository.findAll();
            }
            else {
                return benefitRepository.findAllByBenefitCategory(BenefitCategory.valueOf(benefitCategory));
            }
        }

        if (Objects.equals(benefitCategory, " ")) {
            return benefitRepository.findAllByUserCategory(UserCategory.valueOf(userCategory));
        }

        return benefitRepository.findAllByUserCategoryAndBenefitCategory(UserCategory.valueOf(userCategory), BenefitCategory.valueOf(benefitCategory));
    }

}
