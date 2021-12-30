package com.sparta.homepage.service;

import com.sparta.homepage.models.Board;
import com.sparta.homepage.models.BoardRepository;
import com.sparta.homepage.models.BoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public Long update(Long id, BoardRequestDto requestDto){
        Board board = boardRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return id;
    }


}
