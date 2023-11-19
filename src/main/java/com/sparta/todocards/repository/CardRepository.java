package com.sparta.todocards.repository;

import com.sparta.todocards.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card,Long> {
    List<Card> findAllByOrderByModifiedAtDesc();
    Optional<Card> findByIdAndUserId(Long Id,Long userId);
}
