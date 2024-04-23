package com.example.recipe.order.service;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.CookingMethodRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.service.RecipeService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@ActiveProfiles("test")
class OrderServiceTest {
    @Autowired
    private OrderService orderService;
    @Autowired
    private RecipeService recipeService;
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private CookingMethodRepository cookingMethodRepository;
    @Test
    void save() {
        OrderRequest req = new OrderRequest(2L,1,"test",1L);
        orderService.save(req);

    }

    @Test
    void findByRecipeId() {

    }

    @Test
    void update() {

    }
}