package com.example.hyebozabackend.domain.benefit.service;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import com.example.hyebozabackend.domain.benefit.domain.repository.BenefitRepository;
import com.example.hyebozabackend.domain.benefit.exception.BenefitNotFound;
import com.example.hyebozabackend.domain.benefit.present.dto.BenefitResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ReadOneService {

    private final BenefitRepository benefitRepository;

    @Transactional(readOnly = true)
    public BenefitResponse execute(Long id) {
        Benefit benefit = benefitRepository.findById(id)
                .orElseThrow(() -> BenefitNotFound.EXCEPTION);

        return BenefitResponse.builder()
                .id(benefit.getId())
                .title(benefit.getTitle())
                .content(benefit.getContent())
                .control(benefit.getControl())
                .userCategory(benefit.getUserCategory().getCategory())
                .benefitCategory(benefit.getBenefitCategory().getCategory())
                .build();
    }

}
