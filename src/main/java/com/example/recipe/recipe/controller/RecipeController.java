package com.example.recipe.recipe.controller;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.service.RecipeService;
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
            @RequestBody RecipeAddRequest recipeAddRequest
            ){
            recipeService.addRecipe(recipeAddRequest);
    }

//    @PutMapping("/updaterecipe/{uid}")
//    public Recipe updateRecipe()

}
