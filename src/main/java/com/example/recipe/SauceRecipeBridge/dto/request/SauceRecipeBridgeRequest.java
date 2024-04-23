package com.example.recipe.SauceRecipeBridge.dto.request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Sauce;
import com.example.recipe.global.domain.entity.SauceRecipeBridge;

public record SauceRecipeBridgeRequest (
        Long id,
        Long recipeId,
        Long sauceId
){
    public SauceRecipeBridge toEntity(){
        Recipe recipe = Recipe.builder().id(recipeId).build();
        Sauce sauce = Sauce.builder().id(sauceId).build();
        return SauceRecipeBridge.builder()
                .id(id)
                .sauce(sauce)
                .recipe(recipe)
                .build();
    }
}
