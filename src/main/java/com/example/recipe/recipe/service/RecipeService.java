package com.example.recipe.recipe.service;

import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;

import java.util.List;

public interface RecipeService {

    void addRecipe(RecipeAddRequest recipeAddRequest);

    List<RecipeResponse> getByCookingMethodId(long cookingMethodId);

}
