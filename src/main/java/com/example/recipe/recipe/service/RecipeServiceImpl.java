package com.example.recipe.recipe.service;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.*;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.recipeRequest.SauceRequest;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.service.TagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private TagServiceImpl tagService;
    private final TagRepository tagRepository;
    private final FoodIngredientsRepository foodIngredientsRepository;
    private final FoodIngredientsRecipeBridgeReopsitory foodIngredientsRecipeBridgeReopsitory;
    private final SauceRepository sauceRepository;

    private final CookingOrderRepository cookingOrderRepository;

    @Override
    public void addRecipe(
            RecipeAddRequest recipeAddRequest,
            OrderRequest orderReq,
            IngredientRequest ingredientRequest,
            SauceRequest sauceRequest,
            TagRequest tagRequest
    )   {
        /*
            저장해야 할 repository
            레시피, 재료브릿지, 재료 ,소스브릿지 , 소스
            조리 순서, 태그
         */
        foodIngredientsRepository.save(ingredientRequest.toEntity());
        sauceRepository.save(sauceRequest.toEntity());
        cookingOrderRepository.save(orderReq.toEntity());
        tagRepository.save(tagRequest.toEntity());
        recipeRepository.save(recipeAddRequest.toEntity());
    }

    @Override
    public List<Recipe> getRecipesSortedByCreateAt() {
        return recipeRepository.findAllByOrderByCreateATDesc();
    }
}
