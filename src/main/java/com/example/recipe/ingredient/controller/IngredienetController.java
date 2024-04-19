package com.example.recipe.ingredient.controller;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.ingredient.dto.response.IngredientResponse;
import com.example.recipe.ingredient.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/ingredient")
@RequiredArgsConstructor
public class IngredienetController {
    private final IngredientService ingredientService;

    @GetMapping
    public List<FoodIngredient> getAll() {
        return ingredientService.getAll();
    }
    @GetMapping
    public String getDescriptionById(@RequestParam Long id) {
        return ingredientService.getDescriptionById(id);
    }
    @PostMapping
    public void save(@RequestBody IngredientRequest req) {
        ingredientService.save(req);
    }

    @GetMapping
    public FoodIngredient getById(@PathVariable("id") Long id) {

        return ingredientService.getById(id) ;
    }
    @PostMapping
    public FoodIngredient update(@RequestBody IngredientRequest req,Long id) {
        return ingredientService.update(req,id);
    }


}
