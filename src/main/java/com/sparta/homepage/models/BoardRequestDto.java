package com.sparta.homepage.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BoardRequestDto {

    private final String title;
    private final String username;
    private final String contents;


}
