package com.example.recipe.order.controller;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.order.dto.request.UpdateOrderRequest;
import com.example.recipe.order.dto.response.OrderResponse;
import com.example.recipe.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final RecipeRepository recipeRepository;

    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateOrderRequest req, @PathVariable Long id) {
        orderService.update(req, id);
    }

    @PostMapping
    public void save(@RequestBody OrderRequest req) {
        orderService.save(req);
    }

    @GetMapping("/byrecipe/{recipeId}")
    public List<OrderResponse> findByRecipeId(@PathVariable Long recipeId) {
        return orderService.findByRecipeId(recipeId);
    }

}



