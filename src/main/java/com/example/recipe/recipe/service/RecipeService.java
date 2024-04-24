package com.example.recipe.recipe.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.SauceRecipeBridge.dto.request.SauceRecipeBridgeRequest;
import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.recipeRequest.SauceRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import com.example.recipe.tag.dto.request.TagRequest;

import java.util.List;

public interface RecipeService {


    void addRecipe(
            RecipeAddRequest recipeAddRequest

//            SauceRecipeBridgeRequest sauceRecipeBridgeRequest,

//            TagRecipeBridgeRequest tagRecipeBridgeRequests
    );

    void addother(
            OrderRequest orderReqs,
            IngredientRequest ingredientRequests,
            SauceRequest sauceRequests,
            TagRequest tagRequests
    );

    List<Recipe> getRecipesSortedByCreateAt();
    List<Recipe> getRecipesSortedByType(Long typeId);

    public List<RecipeResponse> getByCookingMethodId(long cookingMethodId);
}
