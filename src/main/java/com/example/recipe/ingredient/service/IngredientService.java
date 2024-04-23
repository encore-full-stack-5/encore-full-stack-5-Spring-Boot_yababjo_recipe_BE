package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.ingredient.dto.request.IngredientRequest;

import java.util.List;
import java.util.Optional;

public interface IngredientService  {
    void  save(IngredientRequest req);

    FoodIngredient getById(Long id);
    String getDescriptionById(Long id);
    FoodIngredient update(IngredientRequest req,Long id);

}
