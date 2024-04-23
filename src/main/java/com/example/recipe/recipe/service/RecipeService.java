package com.example.recipe.recipe.service;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.recipeRequest.SauceRequest;
import com.example.recipe.tag.dto.request.TagRequest;

import java.util.List;

public interface RecipeService {


    void addRecipe(
            RecipeAddRequest recipeAddRequest,
            OrderRequest orderReq,
            IngredientRequest ingredientRequest,
            SauceRequest sauceRequest,
            TagRequest tagRequest
    );

    List<Recipe> getRecipesSortedByCreateAt();

}
