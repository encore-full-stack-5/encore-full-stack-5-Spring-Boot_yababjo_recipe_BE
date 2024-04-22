package com.example.recipe.recipe.dto.recipeRequest;

import com.example.recipe.global.domain.entity.*;

import java.time.LocalDateTime;
import java.util.List;


public record RecipeAddRequest(
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

}
