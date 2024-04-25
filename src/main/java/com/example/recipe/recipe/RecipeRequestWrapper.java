package com.example.recipe.recipe;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.SauceRecipeBridge.dto.request.SauceRecipeBridgeRequest;
import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.tag.dto.request.TagRequest;
import lombok.Getter;

@Getter
public class RecipeRequestWrapper {
    private RecipeAddRequest recipeAddRequest;
    private OrderRequest orderRequest;
    private IngredientRequest ingredientRequests;
    private SauceRequest sauceRequests;
//    private SauceRecipeBridgeRequest sauceRecipeBridgeRequest;
    private TagRequest tagRequests;
//    private TagRecipeBridgeRequest tagRecipeBridgeRequests;
}
