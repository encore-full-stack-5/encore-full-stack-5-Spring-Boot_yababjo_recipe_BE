package com.example.recipe.recipe.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.*;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private final TagRepository tagRepository;
    private final FoodIngredientsRepository foodIngredientsRepository;
    private final FoodIngredientsRecipeBridgeReopsitory foodIngredientsRecipeBridgeReopsitory;
    private final SauceRepository sauceRepository;
    private final SauceRecipeBridgeReopsitory sauceRecipeBridgeReopsitory;
    private final CookingOrderRepository cookingOrderRepository;

    @Override
    public void addRecipe(RecipeAddRequest recipeAddRequest) {

        /* 저장해야 할 repository
            레시피, 재료브릿지, 재료 ,소스브릿지 , 소스
            조리 순서, 태그
         */
        recipeRepository.save(recipeAddRequest.toEntity());

    }

    @Override
    public List<RecipeResponse> getByCookingMethodId(long cookingMethodId) {
        return recipeRepository.findByCookingMethodId(cookingMethodId)
                .stream()
                .map(RecipeResponse::from)
                .toList();
    }


}
