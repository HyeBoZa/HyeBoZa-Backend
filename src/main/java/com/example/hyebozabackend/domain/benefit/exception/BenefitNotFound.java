package com.example.hyebozabackend.domain.benefit.exception;

import com.example.hyebozabackend.global.error.custom.CustomException;
import com.example.hyebozabackend.global.error.custom.ErrorCode;

public class BenefitNotFound extends CustomException {

    public static final BenefitNotFound EXCEPTION =
            new BenefitNotFound();

    public BenefitNotFound() {
        super(ErrorCode.BENEFIT_NOT_FOUND);
    }
}
