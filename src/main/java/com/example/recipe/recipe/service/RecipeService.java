package com.example.recipe.recipe.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import com.example.recipe.tag.dto.request.TagRequest;

import java.util.List;

public interface RecipeService {


    void addRecipe(
            RecipeAddRequest recipeAddRequest  // 레시피 기본 정보 저장
    );

//    void addother(
//            OrderRequest orderReqs,
//            IngredientRequest ingredientRequests,
//            SauceRequest sauceRequests,
//            TagRequest tagRequests
//    );
    List<RecipeResponse> getRecipesSortedByCreateAt(); // 최신순 정렬

    List<RecipeResponse> getRecipesSortedByTypeId(Long typeId); // 종류별 정렬

    List<RecipeResponse> getByCookingMethodId(Long cookingMethodId);  // 방법별 정렬

    List<RecipeResponse> getRecipesByUserId(Long userId); //유저가 만든 레시피 조회

    Recipe getRecipeById(Long recipeId);
}
