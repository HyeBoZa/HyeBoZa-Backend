package com.example.hyebozabackend.domain.benefit.domain.repository;

import com.example.hyebozabackend.domain.benefit.domain.Benefit;
import com.example.hyebozabackend.domain.benefit.domain.QBenefit;
import com.example.hyebozabackend.domain.benefit.domain.type.BenefitCategory;
import com.example.hyebozabackend.domain.benefit.domain.type.UserCategory;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BenefitCustomService implements BenefitCustom {

    private final JPAQueryFactory query;

    @Override
    public List<Benefit> readBenefitsByUserCategoryAndBenefitCategory(String userCategory, String benefitCategory) {
        return query.selectFrom(QBenefit.benefit)
                .where(QBenefit.benefit.userCategory.eq(UserCategory.valueOf(userCategory))
                        .and(QBenefit.benefit.benefitCategory.eq(BenefitCategory.valueOf(benefitCategory))))
                .fetch();
    }

    @Override
    public List<Benefit> readBenefitsByUserCategory(String userCategory) {
        return query.selectFrom(QBenefit.benefit)
                .where(QBenefit.benefit.userCategory.eq(UserCategory.valueOf(userCategory)))
                .fetch();
    }

    @Override
    public List<Benefit> readBenefitsByBenefitCategory(String benefitCategory) {
        return query.selectFrom(QBenefit.benefit)
                .where(QBenefit.benefit.benefitCategory.eq(BenefitCategory.valueOf(benefitCategory)))
                .fetch();
    }


}

