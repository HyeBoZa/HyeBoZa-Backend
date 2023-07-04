package com.example.hyebozabackend.domain.benefit.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BenefitCategory {

    CARD("카드"),
    BENEFIT("혜택"),
    ROYAL("제도"),
    BOOK("정책");

    private final String category;

}
