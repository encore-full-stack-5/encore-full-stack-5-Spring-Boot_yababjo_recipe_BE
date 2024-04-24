package com.example.recipe.global.domain.dto;

import com.example.recipe.global.domain.entity.Recipe;

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
    public static RecipeDto toDto(Recipe recipe) {
        return new RecipeDto(recipe.getId(), recipe.getFoodName(), recipe.getCookingTip(), recipe.getServingSize(), recipe.getLevel(),
                recipe.getCookingTime(), recipe.getCreateAT(),recipe.getRatingAverage(), recipe.getViews());
    }
}
