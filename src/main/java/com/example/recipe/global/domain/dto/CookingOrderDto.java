package com.example.recipe.global.domain.dto;

import com.example.recipe.global.domain.entity.Recipe;

public record CookingOrderDto(
        Long id, int order, String instruction, Recipe recipe

) {

}
