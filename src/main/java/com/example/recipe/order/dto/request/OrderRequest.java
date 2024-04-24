package com.example.recipe.order.dto.request;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;

public record OrderRequest (
        int order, String instruction, long recipeId
){
    public CookingOrder toEntity() {
        return CookingOrder.builder()
                .id(1L)
                .order(order)
                .instruction(instruction)
                .build();
    }
}
