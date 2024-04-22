package com.example.recipe.order.service;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.CookingOrderRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.order.dto.request.UpdateOrderRequest;
import com.example.recipe.order.dto.response.OrderResponse;
import jakarta.transaction.Transactional;
import jakarta.websocket.server.ServerEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final CookingOrderRepository cookingOrderRepository;
    private RecipeRepository recipeRepository;


    @Override
    public void save(OrderRequest req, Long id) {
        cookingOrderRepository.save(req.toEntity());
    }


    @Override
    public List<CookingOrder> findByRecipeId(Long recipeId) {
        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
        List<CookingOrder> orders = new ArrayList<>();
        orders.addAll(recipe.getCookingOrders());
        return orders ;
    }

    @Transactional
    @Override
    public void update(UpdateOrderRequest req, Long id) {
        Optional<CookingOrder> cookingOrder = cookingOrderRepository.findById(id);
        if(cookingOrder.isEmpty()) throw new IllegalArgumentException();
        cookingOrder.get().setOrder(req.order());
        cookingOrder.get().setInstruction(req.instruction());
        cookingOrderRepository.save(cookingOrder.get());
    }




//    public Comment update(CommentRequest req, Long id) {
//        Comment comment = commentRepository.findById(id).orElseThrow(
//                EntityNotFoundException::new);
//        comment.setContent(req.content());
//       return comment;


}
