package com.example.recipe.SauceRecipeBridge.dto.request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Sauce;
import com.example.recipe.global.domain.entity.SauceRecipeBridge;

public record SauceRecipeBridgeRequest (
        Long recipeId,
        Long sauceId
){
    public SauceRecipeBridge toEntity(){
        Recipe recipe = Recipe.builder().id(recipeId).build();
        Sauce sauce = Sauce.builder().id(sauceId).build();
        return SauceRecipeBridge.builder()
                .sauce(sauce)
                .recipe(recipe)
                .build();
    }
}
