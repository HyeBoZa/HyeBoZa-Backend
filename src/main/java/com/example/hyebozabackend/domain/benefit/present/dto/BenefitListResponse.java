package com.example.hyebozabackend.domain.benefit.present.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class BenefitListResponse {
    private List<BenefitResponse> benefitList;
}
