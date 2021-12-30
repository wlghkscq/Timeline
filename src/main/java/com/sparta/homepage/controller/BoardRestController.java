package com.sparta.homepage.controller;


import com.sparta.homepage.models.Board;
import com.sparta.homepage.models.BoardRepository;
import com.sparta.homepage.models.BoardRequestDto;
import com.sparta.homepage.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardRestController {

    private final BoardRepository boardRepository;
    private final BoardService boardService;

    @PostMapping("/api/boards")
    public Board creatBoard(@RequestBody BoardRequestDto requestDto){
        Board board = new Board(requestDto);
        return boardRepository.save(board);
    }


    @GetMapping("/api/boards")
    public List<Board> readBoards(){
        return boardRepository.findAll();
    }

    @DeleteMapping("/api/boards/{id}")
    public Long deleteBoard(@PathVariable Long id){
        boardRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/boards/{id")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto requestDto){
        boardService.update(id, requestDto);
        return id;
    }


}
