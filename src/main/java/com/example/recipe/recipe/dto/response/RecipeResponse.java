package com.example.recipe.recipe.dto.response;

import com.example.recipe.global.domain.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public record RecipeResponse(
        Long userId,
        String recipeTitle,
        String foodName,
        long typeId,
        int servingSize,
        int level,
        double cookingTime,
        List<FoodIngredientsRecipeBridge> foodIngredientsRecipeBridges,
        List<SauceRecipeBridge> sauceRecipeBridges,
        List<CookingOrder> cookingOrders,
        String cookingTip,
        List<TagRecipeBridge> tagRecipeBridges,
        List<Rating> ratings
) {
    public static RecipeResponse from(Recipe recipe) {
        return new RecipeResponse(
                recipe.getUser().getId(),
                recipe.getRecipeTitle(),
                recipe.getFoodName(),
                recipe.getType().getId(),
                recipe.getServingSize(),
                recipe.getLevel(),
                recipe.getCookingTime(),
                recipe.getFoodIngredientsRecipeBridges().stream().toList(),
                recipe.getSauceRecipeBridges().stream().toList(),
                recipe.getCookingOrders().stream().toList(),
                recipe.getCookingTip(),
                recipe.getTagRecipeBridges().stream().toList(),
                recipe.getRatings().stream().toList()
        );
    }
}