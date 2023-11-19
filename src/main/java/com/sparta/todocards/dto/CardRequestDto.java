package com.sparta.todocards.dto;

import lombok.Getter;


@Getter
public class CardRequestDto {
    private String title;
    private String username;
    private String contents;
    private String password;
}
