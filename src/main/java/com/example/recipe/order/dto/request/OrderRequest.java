package com.example.recipe.order.dto.request;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;

public record OrderRequest (
        int order, String instruction, Long recipeId
){
    public CookingOrder toEntity() {
        return CookingOrder.builder()
                .order(order)
                .instruction(instruction)
                .recipe(Recipe.builder().id(recipeId).build())
                .build();
    }
}
