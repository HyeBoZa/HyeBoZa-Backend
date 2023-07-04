package com.example.hyebozabackend.domain.benefit.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserCategory {

    PREGNANT("임산부"),
    OLD("노인"),
    CHILD("어린이"),
    TEEN("청소년"),
    YOUTH("청년");

    private final String category;
}
