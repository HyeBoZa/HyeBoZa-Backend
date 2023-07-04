package com.example.hyebozabackend.global.error.custom;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    BENEFIT_NOT_FOUND(404, "benefit-404-1", "게시물을 찾을 수 없음"),
    BOARD_NOT_FOUND(404, "board-404-1", "게시물을 찾을 수 없음");

    private final int status;
    private final String code;
    private final String message;

}
