package com.example.recipe.recipe.controller;

import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/recipe")
public class RecipeController {
    @Autowired
    private final RecipeService recipeService;

    @PostMapping("/addrecipe/{uid}")
    public void addRecipe(
            @RequestBody RecipeAddRequest recipeAddRequest){

    }
}
