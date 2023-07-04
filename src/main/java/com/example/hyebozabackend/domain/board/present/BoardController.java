package com.example.hyebozabackend.domain.board.present;

import com.example.hyebozabackend.domain.board.present.dto.BoardListResponse;
import com.example.hyebozabackend.domain.board.present.dto.BoardRequest;
import com.example.hyebozabackend.domain.board.present.dto.BoardResponse;
import com.example.hyebozabackend.domain.board.present.dto.SearchBoardRequest;
import com.example.hyebozabackend.domain.board.service.CreateBoardService;
import com.example.hyebozabackend.domain.board.service.ReadAllBoardService;
import com.example.hyebozabackend.domain.board.service.ReadBoardService;
import com.example.hyebozabackend.domain.board.service.SearchBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {

    private final CreateBoardService createBoardService;
    private final ReadAllBoardService readAllBoardService;
    private final ReadBoardService readOneService;
    private final SearchBoardService searchBoardService;

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

    @GetMapping("/search")
    public BoardListResponse search(@RequestBody SearchBoardRequest request) {
        return searchBoardService.execute(request);
    }

}
