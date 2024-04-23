package com.example.recipe.rating.dto.response;

import com.example.recipe.global.domain.entity.Rating;

public record RatingResponse(
        Long id, double rating,
        Long recipeId,
        Long userId
) {
    public static RatingResponse from(Rating rating) {

        return new RatingResponse(
                rating.getId(),
                rating.getRating(),
                rating.getRecipe().getId(),
                rating.getUser().getId()
        );
    }
}
