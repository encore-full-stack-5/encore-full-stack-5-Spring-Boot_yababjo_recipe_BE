package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    @Override
    public void save(IngredientRequest req) {

    }

    @Override
    public List<FoodIngredient> findAll() {
        return List.of();
    }

    @Override
    public FoodIngredient getByName(String name) {
        return null;
    }

    @Override
    public FoodIngredient update(IngredientRequest req, Long id) {
        return null;
    }
}
