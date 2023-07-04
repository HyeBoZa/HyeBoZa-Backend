package com.example.hyebozabackend.domain.benefit.service;

import com.example.hyebozabackend.domain.benefit.domain.repository.BenefitRepository;
import com.example.hyebozabackend.domain.benefit.present.dto.BenefitListResponse;
import com.example.hyebozabackend.domain.benefit.present.dto.BenefitResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReadAllBenefitService {

    private final BenefitRepository benefitRepository;

    @Transactional(readOnly = true)
    public BenefitListResponse execute() {
        List<BenefitResponse> benefitResponses = benefitRepository.findAll().stream()
                .map(benefit -> BenefitResponse.builder()
                        .title(benefit.getTitle())
                        .control(benefit.getControl())
                        .benefitCategory(benefit.getBenefitCategory().getCategory())
                        .userCategory(benefit.getUserCategory().getCategory())
                        .build()
                ).toList();

        return BenefitListResponse.builder()
                .benefitList(benefitResponses)
                .build();
    }

}
