package com.example.hyebozabackend.domain.board.present;

import com.example.hyebozabackend.domain.board.present.dto.BoardListResponse;
import com.example.hyebozabackend.domain.board.present.dto.BoardRequest;
import com.example.hyebozabackend.domain.board.present.dto.BoardResponse;
import com.example.hyebozabackend.domain.board.service.CreateBoardService;
import com.example.hyebozabackend.domain.board.service.ReadAllBoardService;
import com.example.hyebozabackend.domain.board.service.ReadBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {

    private final CreateBoardService createBoardService;
    private final ReadAllBoardService readAllBoardService;
    private final ReadBoardService readOneService;

    @PostMapping
    public void save(@RequestBody BoardRequest request) {
        createBoardService.create(request);
    }

    @GetMapping
    public BoardListResponse readAll() {
        return readAllBoardService.execute();
    }

    @GetMapping("/{id}")
    public BoardResponse read(@PathVariable("id") Long id) {
        return readOneService.execute(id);
    }

}
