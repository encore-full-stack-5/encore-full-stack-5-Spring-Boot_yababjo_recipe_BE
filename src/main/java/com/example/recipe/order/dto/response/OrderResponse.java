package com.example.recipe.order.dto.response;

import com.example.recipe.global.domain.dto.RecipeDto;
import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;

public record OrderResponse(

        Long id, int order, String instruction, RecipeDto recipe

) {
    public static OrderResponse from(CookingOrder order) {

        return new OrderResponse(
                order.getId(),
                order.getOrder(),
                order.getInstruction(),
                RecipeDto.toDto(order.getRecipe())
        );
    }
}
