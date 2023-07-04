package com.example.hyebozabackend.domain.benefit.present.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateBenefitRequest {

    private String title;
    private String content;
    private String control;
    private String userCategory;
    private String benefitCategory;

}
