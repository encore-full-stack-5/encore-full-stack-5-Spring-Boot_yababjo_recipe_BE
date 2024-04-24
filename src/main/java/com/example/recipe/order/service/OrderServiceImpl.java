package com.example.recipe.order.service;

import com.example.recipe.global.domain.entity.CookingOrder;
import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.CookingOrderRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.order.dto.request.UpdateOrderRequest;
import com.example.recipe.order.dto.response.OrderResponse;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.websocket.server.ServerEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final CookingOrderRepository cookingOrderRepository;
    private final RecipeRepository recipeRepository;


    @Override
    public void save(OrderRequest req) {
        Long byId = req.recipeId();
        Recipe recipe = recipeRepository.findById(byId).orElseThrow(EntityNotFoundException::new);
        CookingOrder entity = req.toEntity();
        cookingOrderRepository.save(entity);
    }


    @Override
    public List<OrderResponse> findByRecipeId(Long recipeId) {
//        Recipe recipe = recipeRepository.findById(recipeId).orElse(null);
//        List<CookingOrder> orders = new ArrayList<>();
//        orders.addAll(recipe.getCookingOrders());
//        return orders ;
        Optional<Recipe> recipeOptional = recipeRepository.findById(recipeId);

        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            return recipe.getCookingOrders().stream().map(
                    OrderResponse::from
            ).toList();
        } else {
            return Collections.emptyList(); // Return an empty list if the recipe is not found
        }
    }

    @Transactional
    @Override
    public void update(UpdateOrderRequest req, Long id) {
        Optional<CookingOrder> cookingOrder = cookingOrderRepository.findById(id);
        if(cookingOrder.isEmpty()) throw new IllegalArgumentException();

        CookingOrder order = cookingOrder.get();
        order.setOrder(req.order());
        order.setInstruction(req.instruction());

    }


//    public Comment update(CommentRequest req, Long id) {
//        Comment comment = commentRepository.findById(id).orElseThrow(
//                EntityNotFoundException::new);
//        comment.setContent(req.content());
//       return comment;
//FoodIngredient existingIngredient = ingredientsRepository.getById(id);
//        existingIngredient.setName(req.name());
//        existingIngredient.setDescription(req.description());
//        existingIngredient.setType(req.type());

}
