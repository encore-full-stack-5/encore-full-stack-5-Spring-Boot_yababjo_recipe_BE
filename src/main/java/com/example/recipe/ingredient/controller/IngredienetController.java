package com.example.recipe.ingredient.controller;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.ingredient.dto.response.IngredientResponse;
import com.example.recipe.ingredient.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/ingredient")
@RequiredArgsConstructor
public class IngredienetController {
    @Autowired
    private final IngredientService ingredientService;


    @GetMapping("/description/{id}")
    public String getDescriptionById(@PathVariable("id") Long id) {
        return ingredientService.getDescriptionById(id);
    }
    @PostMapping
    public void save(@RequestBody IngredientRequest req) {
        ingredientService.save(req);
    }

    @GetMapping("/{id}")
    public FoodIngredient getById(@PathVariable("id") Long id) {

        return ingredientService.getById(id) ;
    }
    @PostMapping("/{id}")
    public FoodIngredient update(@RequestBody IngredientRequest req, @PathVariable("id") Long id) {
        return ingredientService.update(req,id);
    }


}
