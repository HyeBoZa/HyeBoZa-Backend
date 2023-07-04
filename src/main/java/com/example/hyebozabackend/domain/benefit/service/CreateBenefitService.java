package com.example.hyebozabackend.domain.benefit.service;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import com.example.hyebozabackend.domain.benefit.domain.repository.BenefitRepository;
import com.example.hyebozabackend.domain.benefit.domain.type.BenefitCategory;
import com.example.hyebozabackend.domain.benefit.domain.type.UserCategory;
import com.example.hyebozabackend.domain.benefit.present.dto.CreateBenefitRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CreateBenefitService {

    private final BenefitRepository benefitRepository;

    @Transactional
    public void execute(CreateBenefitRequest request) {
        benefitRepository.save(
                Benefit.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .control(request.getControl())
                        .userCategory(UserCategory.valueOf(request.getUserCategory()))
                        .benefitCategory(BenefitCategory.valueOf(request.getBenefitCategory()))
                        .build()
        );
    }

}
