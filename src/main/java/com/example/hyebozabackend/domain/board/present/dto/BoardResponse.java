package com.example.hyebozabackend.domain.board.present.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BoardResponse {
    private Long id;
    private String title;
    private String content;
}
