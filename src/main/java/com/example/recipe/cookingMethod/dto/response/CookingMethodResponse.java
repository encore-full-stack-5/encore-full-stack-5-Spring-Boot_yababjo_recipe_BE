package com.example.recipe.cookingMethod.dto.response;

import com.example.recipe.global.domain.dto.RecipeDto;
import com.example.recipe.global.domain.entity.CookingMethod;

import java.util.List;

public record CookingMethodResponse(
        Long cookingMethodId,
        String cookingMethodName,
        List<RecipeDto> recipes
) {
    public static CookingMethodResponse from(CookingMethod cookingMethod) {
        List<RecipeDto> list = cookingMethod.getRecipes()
                .stream()
                .map(recipe ->  new RecipeDto(
                        recipe.getId(),
                        recipe.getFoodName(),
                        recipe.getCookingTip(),
                        recipe.getServingSize(),
                        recipe.getLevel(),
                        recipe.getCookingTime(),
                        recipe.getCreateAT(),
                        recipe.getRatingAverage(),
                        recipe.getViews()
                ))
                .toList();
        return new CookingMethodResponse(
                cookingMethod.getId(),
                cookingMethod.getName(),
                list
        );
    }
}
