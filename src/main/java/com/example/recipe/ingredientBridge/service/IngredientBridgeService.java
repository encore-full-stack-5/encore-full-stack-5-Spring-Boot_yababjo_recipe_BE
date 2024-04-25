package com.example.recipe.ingredientBridge.service;

import com.example.recipe.ingredientBridge.dto.request.IngredientBridgeRequest;

public interface IngredientBridgeService {
   void save(Long recipeId, Long ingredientId);
}
