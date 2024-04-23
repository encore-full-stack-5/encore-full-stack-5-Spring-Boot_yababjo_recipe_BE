package com.example.recipe.recipe.controller;


import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.recipeRequest.SauceRequest;
import com.example.recipe.recipe.service.RecipeService;
import com.example.recipe.tag.dto.request.TagRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/recipe")
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;

    @PostMapping("/addrecipe")
    public void addRecipe(
            @RequestBody RecipeAddRequest recipeAddRequest,
            @RequestBody OrderRequest orderReq,
            @RequestBody IngredientRequest ingredientRequest,
            @RequestBody SauceRequest sauceRequest,
            @RequestBody TagRequest tagRequest
            ){
            recipeService.addRecipe(
                    recipeAddRequest,
                    orderReq,
                    ingredientRequest,
                    sauceRequest,
                    tagRequest
            );
    }



//    @PutMapping("/updaterecipe/{uid}")
//    public Recipe updateRecipe()

}
