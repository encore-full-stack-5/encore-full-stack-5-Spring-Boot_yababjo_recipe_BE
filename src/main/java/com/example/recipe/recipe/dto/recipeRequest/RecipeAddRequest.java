package com.example.recipe.recipe.dto.recipeRequest;

import com.example.recipe.global.domain.entity.*;

import java.time.LocalDateTime;
import java.util.List;


public record RecipeAddRequest(
        Long userId,
        String recipeTitle,
        String foodName,
        long cookingMethodId,
        long typeId,
        int servingSize,
        int level,
        double cookingTime,
        List<FoodIngredientsRecipeBridge> foodIngredientsRecipeBridges,
        List<SauceRecipeBridge> sauceRecipeBridges,
        List<CookingOrder> cookingOrders,
        String cookingTip,
        List<TagRecipeBridge> tagRecipeBridges
) {
    public Recipe toEntity(){
        return Recipe.builder()
                .user(User.builder()
                        .id(userId)
                        .build())
                .recipeTitle(recipeTitle)
                .foodName(foodName)
                .cookingMethod(CookingMethod.builder()
                        .id(cookingMethodId)
                        .build())
                .type(Type.builder()
                        .id(typeId)
                        .build())
                .servingSize(servingSize)
                .level(level)
                .cookingTime(cookingTime)
                .foodIngredientsRecipeBridges(foodIngredientsRecipeBridges)
                .sauceRecipeBridges(sauceRecipeBridges)
                .cookingOrders(cookingOrders)
                .tagRecipeBridges(tagRecipeBridges)
                .createAT(LocalDateTime.now())
                .build();
    }
}
