package com.example.recipe.rating.dto.request;

import com.example.recipe.global.domain.entity.Rating;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

public record RatingRequest(
        double rating,
        Long recipeId,
        Long userId
) {
    public Rating toEntity() {
        return Rating.builder()
                .rating(rating)
                .user(User.builder().id(userId).build())
                .recipe(Recipe.builder().id(recipeId).build())
                .build();
    }
}
