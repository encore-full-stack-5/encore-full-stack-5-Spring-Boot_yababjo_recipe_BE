package com.example.recipe.recipe.dto.recipeRequest;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.global.domain.entity.*;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.rating.dto.request.RatingRequest;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.type.dto.request.TypeRequest;

import java.time.LocalDateTime;
import java.util.List;

public record RecipeAddRequest(
        String recipeTitle,
        String foodName,
        Long cookingMethodId,
        Long typeId,
        int servingSize,
        int level,
        double cookingTime,
        String cookingTip,
        Long userId,
//        IngredientRequest ingredientRequest,
//        TagRequest tagRequest,
//        OrderRequest orderRequest,
//        RatingRequest ratingRequest,
//        SauceRequest sauceRequest,
//        TypeRequest typeRequest,
        String keyword,
        String name,
        double ingredientsMeasurement,
        String sauceName,
        double sauceMeasurement,
        int order,
        String instruction
) {
    public Recipe toEntity(){
        return Recipe.builder()
                .user(User.builder()
                        .id(userId)
                        .build())
                .recipeTitle(recipeTitle)
                .foodName(foodName)
                .type(Type.builder()
                        .id(typeId)
                        .build())
                .cookingMethod(CookingMethod.builder()
                        .id(cookingMethodId)
                        .build())
                .servingSize(servingSize)
                .level(level)
                .cookingTip(cookingTip)
                .cookingTime(cookingTime)

                .createAT(LocalDateTime.now())
                .build();
    }
    public Tag tagAdd(RecipeAddRequest recipeAddRequest){

        return Tag.builder().keyword(recipeAddRequest.keyword).build();
    }

    public Sauce sauceAdd(RecipeAddRequest recipeAddRequest){

        return Sauce.builder()
                .sauceName(recipeAddRequest.sauceName)
                .sauceMeasurement(recipeAddRequest.sauceMeasurement)
                .build();
    }

}
