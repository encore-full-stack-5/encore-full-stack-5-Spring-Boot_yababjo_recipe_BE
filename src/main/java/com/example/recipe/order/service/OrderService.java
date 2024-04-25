package com.example.recipe.order.service;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.order.dto.request.UpdateOrderRequest;
import com.example.recipe.order.dto.response.OrderResponse;
import jakarta.persistence.criteria.Order;

import java.util.List;

public interface OrderService {
    void save(OrderRequest req);
    List<OrderResponse> findByRecipeId(Long recipeId);
    void update(UpdateOrderRequest req, Long id);

}
