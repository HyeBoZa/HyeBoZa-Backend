package com.example.hyebozabackend.domain.board.domain.repository;

import com.example.hyebozabackend.domain.board.domain.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
    Optional<Board> findBoardById(Long id);
    List<Board> findAll();
}
