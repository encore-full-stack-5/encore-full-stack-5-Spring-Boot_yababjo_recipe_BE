package com.example.recipe.global.domain.dto;

import java.time.LocalDateTime;

public record RecipeDto(
    Long id,
    String name,
    String tip,
    int servingSize,
    int cookingLevel,
    double cookingTime,
    LocalDateTime recipeCreateDate,
    double averageRating,
    int recipeViews
) {
}
