package com.example.recipe.ingredient.dto.request;

import com.example.recipe.global.domain.entity.FoodIngredient;

public record IngredientRequest(
        String name,
        String type,
        double ingredientsMeasurement,
        String description

) {
    public FoodIngredient toEntity(){
        return FoodIngredient.builder()
                .name(name)
                .description(description)
                .ingredientsMeasurement(ingredientsMeasurement)
                .type(type)
                .build();
    }


}
