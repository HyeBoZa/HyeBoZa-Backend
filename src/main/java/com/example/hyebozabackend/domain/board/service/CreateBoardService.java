package com.example.hyebozabackend.domain.board.service;

import com.example.hyebozabackend.domain.board.domain.Board;
import com.example.hyebozabackend.domain.board.domain.repository.BoardRepository;
import com.example.hyebozabackend.domain.board.present.dto.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CreateBoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public void create(BoardRequest request) {
        boardRepository.save(
                Board.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .build()
        );
    }
}
