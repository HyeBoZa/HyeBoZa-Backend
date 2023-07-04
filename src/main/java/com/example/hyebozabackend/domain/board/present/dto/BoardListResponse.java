package com.example.hyebozabackend.domain.board.present.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class BoardListResponse {
    private List<BoardResponse> boardList;
}
