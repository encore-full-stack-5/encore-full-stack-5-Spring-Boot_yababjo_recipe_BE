package com.example.recipe.order.dto.request;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;

public record UpdateOrderRequest(
        int order, String instruction
) {
    public CookingOrder toEntity() {
        return CookingOrder.builder()
                .order(order)
                .instruction(instruction)

                .build();
    }
}
