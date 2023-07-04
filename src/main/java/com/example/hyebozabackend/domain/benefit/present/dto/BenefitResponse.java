package com.example.hyebozabackend.domain.benefit.present.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BenefitResponse {

    private String title;
    private String control;
    private String userCategory;
    private String benefitCategory;

}
