package com.example.recipe.ingredient.dto.request;

import com.example.recipe.global.domain.entity.FoodIngredient;

public record IngredientRequest(
        Long id,String name,String type,String description

) {
    public FoodIngredient toEntity(){
        return FoodIngredient.builder()
                .id(id)
                .name(name)
                .description(description)
                .type(type)
                .build();
    }


}
