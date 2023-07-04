package com.example.hyebozabackend.domain.board.service;

import com.example.hyebozabackend.domain.board.domain.repository.BoardRepository;
import com.example.hyebozabackend.domain.board.present.dto.BoardListResponse;
import com.example.hyebozabackend.domain.board.present.dto.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReadAllBoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardListResponse execute() {
        List<BoardResponse> boardResponses = boardRepository.findAll().stream()
                .map(board -> BoardResponse.builder()
                        .id(board.getId())
                        .title(board.getTitle())
                        .content(board.getContent())
                        .build())
                .collect(Collectors.toList());

        return BoardListResponse.builder()
                .boardList(boardResponses)
                .build();
    }
}
