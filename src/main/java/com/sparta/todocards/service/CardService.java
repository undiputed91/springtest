package com.sparta.todocards.service;


import com.sparta.todocards.dto.CardRequestDto;
import com.sparta.todocards.dto.CardResponseDto;
import com.sparta.todocards.entity.User;
import com.sparta.todocards.jwt.JwtUtil;
import com.sparta.todocards.repository.CardRepository;
import com.sparta.todocards.repository.UserRepository;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public void postCard(CardRequestDto requestDto, HttpServletRequest req) {}


}
