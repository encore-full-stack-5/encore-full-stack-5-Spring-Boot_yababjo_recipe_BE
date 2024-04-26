package com.example.recipe.recipe.controller;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.recipe.RecipeRequestWrapper;

import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeIdResponse;
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
    public List<Recipe> getRecipesSortedByCreateAt(){
        return recipeService.getRecipesSortedByCreateAt();
    }

    @GetMapping("/type/{typeid}")
    public List<Recipe> getRecipesSortedByType(@PathVariable("typeid") Long typeId){
        return recipeService.getRecipesSortedByTypeId(typeId);
    }

    @GetMapping("/{id}")
    public RecipeIdResponse getRecipe(@PathVariable("id") Long id){
        return recipeService.getById(id);
    }

    @GetMapping("/count")
    public int getRecipeCount(){
        return recipeService.getAllRecipeCount();
    }
}
