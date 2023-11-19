package com.sparta.todocards.controller;

import com.sparta.todocards.dto.CardRequestDto;
import com.sparta.todocards.dto.CardResponseDto;
import com.sparta.todocards.service.CardService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CardController {
    private final CardService cardService;

    @PostMapping("/post")
    public CardResponseDto postCard(@RequestBody CardRequestDto requestDto, HttpServletRequest req){
        return cardService.postCard(requestDto,req);
    }
}
