package com.example.recipe.recipe.service;

import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.recipeRequest.SauceRequest;
import com.example.recipe.tag.dto.Request.TagRequest;

public interface RecipeService {


    void addRecipe(
            RecipeAddRequest recipeAddRequest,
            OrderRequest orderReq,
            IngredientRequest ingredientRequest,
            SauceRequest sauceRequest,
            TagRequest tagRequest
    );

}
