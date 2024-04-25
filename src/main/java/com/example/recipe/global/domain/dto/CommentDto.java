package com.example.recipe.global.domain.dto;

import java.time.LocalDateTime;

public record CommentDto(
        Long id, String content //int rating,
) {
}
