package com.example.recipe.recipe.controller;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.recipe.RecipeRequestWrapper;
import com.example.recipe.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/recipe")
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;

    @PostMapping("/addrecipe")
    public void addRecipe(
            @RequestBody RecipeRequestWrapper recipeRequestWrapper
            ){
            recipeService.addRecipe(
                    recipeRequestWrapper.getRecipeAddRequest(),
                    recipeRequestWrapper.getOrderRequest(),
                    recipeRequestWrapper.getIngredientRequests(),
                    recipeRequestWrapper.getSauceRequests(),
//                    recipeRequestWrapper.getSauceRecipeBridgeRequest(),
                    recipeRequestWrapper.getTagRequests()
//                    recipeRequestWrapper.getTagRecipeBridgeRequests()
            );
    }

    @GetMapping("/recently")
    public List<Recipe> getRecipesSortedByCreateAt(){
        return recipeService.getRecipesSortedByCreateAt();
    }

    @GetMapping("/type/{typeid}")
    public List<Recipe> getRecipesSortedByType(@PathVariable("typeid") Long typeId){
        return recipeService.getRecipesSortedByType(typeId);
    }



//    @PutMapping("/updaterecipe/{uid}")
//    public Recipe updateRecipe()

}
