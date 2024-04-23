package com.example.recipe.recipe.service;

import com.example.recipe.global.domain.entity.FoodIngredients;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.repository.*;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private final TagRepository tagRepository;
    private final FoodIngredientsRepository foodIngredientsRepository;
    private final FoodIngredientsRecipeBridgeReopsitory foodIngredientsRecipeBridgeReopsitory;
    private final SauceRepository sauceRepository;

    private final CookingOrderRepository cookingOrderRepository;

    @Override
    public void addRecipe(RecipeAddRequest recipeAddRequest) {
        /* 저장해야 할 repository
            레시피, 재료브릿지, 재료 ,소스브릿지 , 소스
            조리 순서, 태그
         */
        
        recipeRepository.save(recipeAddRequest.toEntity());
    }


}
