package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.repository.FoodIngredientsRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class IngredientServiceTest {
    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private  FoodIngredientsRepository foodIngredientsRepository;

    @Test
    void save() {

    }

    @Test
    void findAll() {
    }

    @Test
    void getByName() {
    }

    @Test
    void update() {
    }


}