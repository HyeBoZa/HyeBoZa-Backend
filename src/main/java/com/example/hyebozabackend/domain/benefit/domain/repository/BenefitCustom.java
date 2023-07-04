package com.example.hyebozabackend.domain.benefit.domain.repository;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;

import java.util.List;

public interface BenefitCustom {
    List<Benefit> readBenefitsByUserCategoryAndBenefitCategory(String userCategory, String benefitCategory);
    List<Benefit> readBenefitsByUserCategory(String userCategory);
    List<Benefit> readBenefitsByBenefitCategory(String benefitCategory);

}
