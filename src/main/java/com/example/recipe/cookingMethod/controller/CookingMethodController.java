package com.example.recipe.cookingMethod.controller;

import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import com.example.recipe.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/recipe")
public class CookingMethodController {
    @Autowired
    private final RecipeService recipeService;

    @GetMapping("/cookingMethod/{cookingMethodId}")
    public List<RecipeResponse> findByCookingMethodId(
            @PathVariable Long cookingMethodId
    ){
        return recipeService.getByCookingMethodId(cookingMethodId);
    }
}