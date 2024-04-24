package com.example.recipe.ingredientBridge.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.global.domain.entity.FoodIngredientsRecipeBridge;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.FoodIngredientsRecipeBridgeReopsitory;
import com.example.recipe.global.domain.repository.FoodIngredientsRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.ingredientBridge.dto.request.IngredientBridgeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientBridgeServceImpl implements IngredientBridgeService {
    @Autowired
    private FoodIngredientsRecipeBridgeReopsitory  foodIngredientsRecipeBridgeReopsitory;
    @Autowired
    private FoodIngredientsRepository foodIngredientsRepository;
    @Autowired
    private RecipeRepository recipeRepository;



    @Override
    public void save(Long recipeId, Long ingredientId) {
        Recipe recipe = recipeRepository.findById(recipeId).orElseThrow(() -> new IllegalArgumentException("recipe not found"));
        FoodIngredient ingredient = foodIngredientsRepository.findById(ingredientId).orElseThrow(() -> new IllegalArgumentException("ingredient not found"));

        Long rid = recipe.getId();
        Long fid = ingredient.getId();
        FoodIngredientsRecipeBridge bridge = new FoodIngredientsRecipeBridge(null, recipe, ingredient);
        foodIngredientsRecipeBridgeReopsitory.save(bridge);

    }
}
