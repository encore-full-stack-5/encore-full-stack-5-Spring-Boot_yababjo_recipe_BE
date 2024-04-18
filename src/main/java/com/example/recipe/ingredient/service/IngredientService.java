package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.ingredient.dto.request.IngredientRequest;

import java.util.List;

public interface IngredientService  {
    void  save(IngredientRequest req);
    List<FoodIngredient> findAll();
    FoodIngredient getByName(String name);
    FoodIngredient update(IngredientRequest req,Long id);

}
