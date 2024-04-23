package com.example.recipe.order.service;

import com.example.recipe.global.domain.entity.CookingMethod;
import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.CookingMethodRepository;
import com.example.recipe.global.domain.repository.CookingOrderRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.order.dto.request.UpdateOrderRequest;
import com.example.recipe.recipe.service.RecipeService;
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
class OrderServiceTest {
    @Autowired
    private OrderService orderService;
    @Autowired
    private RecipeService recipeService;
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private CookingMethodRepository cookingMethodRepository;
    @Autowired
    private CookingOrderRepository cookingOrderRepository;

    @Test
    void save() {
        OrderRequest req = new OrderRequest(1,"test",1L);
        orderService.save(req);

    }

    @Test
    void findByRecipeId() {
            orderService.findByRecipeId(2L);
    }

    @Test
    @Transactional
    void update() {

        // init
        Recipe recipe = Recipe.builder().id(1L).build();
        CookingOrder order = CookingOrder.builder()
                .order(1)
                .recipe(recipe)
                .instruction("1111")
                .build();
        cookingOrderRepository.save(order);
        Assertions.assertNotNull(order.getId());

        // given
//        Optional<CookingOrder> byId = cookingOrderRepository.findById(1L);
        UpdateOrderRequest req = new  UpdateOrderRequest(2,"test2");
       Long id = order.getId();

       // when
        orderService.update(req,id);


        //then
        Optional<CookingOrder> byId = cookingOrderRepository.findById(id);
        Assertions.assertTrue(byId.isPresent());
        CookingOrder check = byId.get();
        Assertions.assertEquals(2,check.getOrder());
        Assertions.assertEquals("test2",check.getInstruction());

    }
}