package com.sparta.todocards.dto;

import com.sparta.todocards.entity.Card;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter

public class CardResponseDto {
    private Long id;
    private String title;
    private String username;
    private String contents;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public CardResponseDto(Card card) {
        this.id = card.getId();
        this.title = card.getTitle();
        this.username = card.getUsername();
        this.contents = card.getContents();
        this.password = card.getPassword();
        this.createdAt = card.getCreatedAt();
        this.modifiedAt = card.getModifiedAt();
    }
}
