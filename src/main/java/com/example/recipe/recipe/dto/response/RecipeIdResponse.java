package com.example.recipe.recipe.dto.response;

import com.example.recipe.global.domain.entity.*;

import java.util.List;

public record RecipeIdResponse(
        Long userId,
        String recipeTitle,
        String foodName,
        long typeId,
        int servingSize,
        int level,
        double cookingTime,
        List<Long> foodIngredientsRecipeBridges,
        List<Long> sauceRecipeBridges,
        List<Long> cookingOrders,
        String cookingTip,
        List<Long> tagRecipeBridges,
        List<Double> ratings
) {
    public static RecipeIdResponse from(Recipe recipe) {
        return new RecipeIdResponse(
                recipe.getUser().getId(),
                recipe.getRecipeTitle(),
                recipe.getFoodName(),
                recipe.getType().getId(),
                recipe.getServingSize(),
                recipe.getLevel(),
                recipe.getCookingTime(),
                recipe.getFoodIngredientsRecipeBridges().stream()
                        .map(FoodIngredientsRecipeBridge::getId).toList(),
                recipe.getSauceRecipeBridges().stream()
                        .map(SauceRecipeBridge::getId).toList(),
                recipe.getCookingOrders().stream()
                        .map(CookingOrder::getId).toList(),
                recipe.getCookingTip(),
                recipe.getTagRecipeBridges().stream()
                        .map(TagRecipeBridge::getId).toList(),
                recipe.getRatings().stream()
                        .map(Rating::getRating).toList()
        );
    }
}