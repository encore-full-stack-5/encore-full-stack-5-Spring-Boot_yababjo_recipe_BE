package com.example.recipe.ingredient.dto.response;

import com.example.recipe.global.domain.entity.FoodIngredient;

public record IngredientResponse(
        Long id, String name, String description, String type
) {

}
