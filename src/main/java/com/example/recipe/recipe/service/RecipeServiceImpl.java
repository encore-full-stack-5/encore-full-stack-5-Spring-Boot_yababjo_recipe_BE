package com.example.recipe.recipe.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.Sauce.service.SauceServiceImpl;
import com.example.recipe.SauceRecipeBridge.dto.request.SauceRecipeBridgeRequest;
import com.example.recipe.SauceRecipeBridge.service.SauceRecipeBridgeServiceImpl;
import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.TagRecipeBridge.service.TagRecipeBridgeServiceImpl;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Type;
import com.example.recipe.global.domain.repository.*;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.ingredient.service.IngredientServiceImpl;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.service.TagServiceImpl;
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
    private final SauceRecipeBridgeRepository sauceRecipeBridgeRepository;
    private final CookingOrderRepository cookingOrderRepository;

    private final IngredientServiceImpl ingredientService;

    private final SauceServiceImpl sauceService;
    private final SauceRecipeBridgeServiceImpl sauceRecipeBridgeService;
    private final TagServiceImpl tagService;
    private final TagRecipeBridgeServiceImpl tagRecipeBridgeService;

    @Override
    public void addRecipe(
            RecipeAddRequest recipeAddRequest
//          SauceRecipeBridgeRequest sauceRecipeBridgeRequest,
//          TagRecipeBridgeRequest tagRecipeBridgeRequests
    )   {
        /*
            저장해야 할 repository
            레시피, 재료 브릿지, 재료 ,소스 브릿지 , 소스
            조리 순서, 태그
         */
        recipeRepository.save(recipeAddRequest.toEntity());
    }

    @Override
    public void addother(
            OrderRequest orderReqs,
            IngredientRequest ingredientRequests,
            SauceRequest sauceRequests,
            TagRequest tagRequests
            ) {
        cookingOrderRepository.save(orderReqs.toEntity());

        ingredientService.save(ingredientRequests);
        // 재료 브릿지 서비스 필요

        sauceService.save(sauceRequests);

        tagService.save(tagRequests);
//        sauceRecipeBridgeService.save(sauceRecipeBridgeRequest);
//        tagRecipeBridgeService.save(tagRecipeBridgeRequests);

    }


    @Override
    public List<Recipe> getRecipesSortedByCreateAt() {
        return recipeRepository.findAllByOrderByCreateATDesc();
    }


    @Override
    public List<Recipe> getRecipesSortedByType(Long typeID) {
        long typeId = new Type().getId();
        return recipeRepository.findByTypeId(typeId);
    }
}
