package com.example.hyebozabackend.domain.board.exception;

import com.example.hyebozabackend.global.error.custom.CustomException;
import com.example.hyebozabackend.global.error.custom.ErrorCode;

public class BoardNotFoundException extends CustomException {
    public static final BoardNotFoundException EXCEPTION =
            new BoardNotFoundException();

    public BoardNotFoundException() {
        super(ErrorCode.BOARD_NOT_FOUND);
    }
}
