package com.example.hyebozabackend.domain.benefit.service;

import com.example.hyebozabackend.domain.benefit.facade.BenefitFacade;
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

    private final BenefitFacade benefitFacade;

    @Transactional(readOnly = true)
    public BenefitListResponse execute(String user, String benefit) {
        List<BenefitResponse> benefitResponses = benefitFacade.execute(user, benefit).stream()
                .map(benefit1 -> BenefitResponse.builder()
                        .title(benefit1.getTitle())
                        .content(benefit1.getContent())
                        .control(benefit1.getControl())
                        .userCategory(benefit1.getUserCategory().getCategory())
                        .benefitCategory(benefit1.getBenefitCategory().getCategory())
                        .build())
                .collect(Collectors.toList());

        return BenefitListResponse.builder()
                .benefitList(benefitResponses)
                .build();
    }

}
