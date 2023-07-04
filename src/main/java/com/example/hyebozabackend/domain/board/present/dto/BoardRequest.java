package com.example.hyebozabackend.domain.board.present.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardRequest {

    private String title;
    private String content;

}
