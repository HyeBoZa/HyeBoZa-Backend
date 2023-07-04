package com.example.hyebozabackend.domain.board.service;

import com.example.hyebozabackend.domain.board.domain.Board;
import com.example.hyebozabackend.domain.board.domain.repository.BoardRepository;
import com.example.hyebozabackend.domain.board.exception.BoardNotFoundException;
import com.example.hyebozabackend.domain.board.present.dto.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ReadOneService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardResponse execute(Long id) {
        Board board = boardRepository.findBoardById(id)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        return BoardResponse.builder()
                .id(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .build();
    }

}
