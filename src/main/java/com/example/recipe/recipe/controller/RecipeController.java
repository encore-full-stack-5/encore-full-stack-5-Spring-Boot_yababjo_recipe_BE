package com.example.recipe.recipe.controller;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.recipe.RecipeRequestWrapper;

import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import com.example.recipe.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recipe")
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;

    @PostMapping("/addrecipe")
    public void addRecipe(
            @RequestBody RecipeAddRequest recipeAddRequest
            ){
            recipeService.addRecipe(
                    recipeAddRequest
//                    recipeRequestWrapper.getOrderRequest(),
//                    recipeRequestWrapper.getIngredientRequests(),
//                    recipeRequestWrapper.getSauceRequests(),
////                  recipeRequestWrapper.getSauceRecipeBridgeRequest(),
//                    recipeRequestWrapper.getTagRequests()
//                    recipeRequestWrapper.getTagRecipeBridgeRequests()
            );
    }

    @GetMapping("/recently")
    public List<RecipeResponse> getRecipesSortedByCreateAt(){
        return recipeService.getRecipesSortedByCreateAt();
    }

    @GetMapping("/type/{typeid}")
    public List<RecipeResponse> getRecipesSortedByType(@PathVariable("typeid") Long typeId){
        return recipeService.getRecipesSortedByTypeId(typeId);
    }

    @GetMapping("/method/{methodid}")
    public List<RecipeResponse> getRecipesSortedByMethod(@PathVariable("methodid") Long methodId){
        return recipeService.getByCookingMethodId(methodId);
    }

    @GetMapping("/{uid}")
    public List<RecipeResponse> getRecipesByUserId (@PathVariable("uid") Long userId){
        return recipeService.getRecipesByUserId(userId);
    }

    @GetMapping("/detail/{id}")
    public Recipe getRecipesById(@PathVariable("id") Long recipeId){
        return recipeService.getRecipeById(recipeId);
    }


}
