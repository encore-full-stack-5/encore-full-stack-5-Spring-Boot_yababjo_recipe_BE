package com.example.recipe.global.domain.dto;

public record RatingDto(
        Long id, double ratingSum,
        int count
) {
}
