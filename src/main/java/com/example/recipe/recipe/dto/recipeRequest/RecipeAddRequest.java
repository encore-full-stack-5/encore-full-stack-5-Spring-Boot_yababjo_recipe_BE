package com.example.recipe.recipe.dto.recipeRequest;

import com.example.recipe.global.domain.entity.*;

import java.time.LocalDateTime;
import java.util.List;

public record RecipeAddRequest(
        String recipeTitle,
        String foodName,
        Long cookingMethodId,
        Long typeId,
        int servingSize,
        int level,
        double cookingTime,
        String cookingTip,
        Long userId

) {
    public Recipe toEntity(){
        return Recipe.builder()

                .user(User.builder()
                        .id(userId)
                        .build())
                .recipeTitle(recipeTitle)
                .foodName(foodName)
                .type(Type.builder()
                        .id(typeId)
                        .build())
                .cookingMethod(CookingMethod.builder()
                        .id(cookingMethodId)
                        .build())
                .servingSize(servingSize)
                .level(level)
                .cookingTip(cookingTip)
                .cookingTime(cookingTime)
                .createAT(LocalDateTime.now())
                .build();
    }
}
