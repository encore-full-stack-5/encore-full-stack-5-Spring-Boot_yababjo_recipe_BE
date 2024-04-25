package com.example.recipe.order.dto.response;

import com.example.recipe.global.domain.entity.CookingOrder;

public record OrderResponse(

        Long id, int order, String instruction, Long recipeId
) {
    public static OrderResponse from(CookingOrder order) {

        return new OrderResponse(
                order.getId(),
                order.getOrder(),
                order.getInstruction(),
                order.getRecipe().getId()
        );
    }
}
