package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.global.domain.repository.FoodIngredientsRepository;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@ActiveProfiles("test")
class IngredientServiceTest {
    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private  FoodIngredientsRepository foodIngredientsRepository;

//    @Test
////    void save() {
////        IngredientRequest req = new IngredientRequest(1L,"ksh","FF",0.0D,"F");
//        ingredientService.save(req);
//    }


    @Test
    void getById() {
        FoodIngredient id = foodIngredientsRepository.findById(1L).get();
        Assertions.assertEquals(1,id.getId());

    }

    @Test
    void getDescriptionById() {
         String des = foodIngredientsRepository.getById(1L).getDescription();
         Assertions.assertEquals("1",des);

    }

//    @Test
//    void update() {
//         FoodIngredient  ingredient =  foodIngredientsRepository.getById(1L);
//        IngredientRequest req = new IngredientRequest(1L,"ramen","test",0.0D,"test");
//        Long id = ingredient.getId();
//        ingredientService.update(req, id);
//
//    }
}