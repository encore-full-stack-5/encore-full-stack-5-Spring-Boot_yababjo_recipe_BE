package com.example.recipe.tag.dto.request;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.User;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;


public record TagRequest(
    String keyword,
    Long userId
) {
    public Tag toEntity(RecipeAddRequest recipeAddRequest) {

        return Tag.builder()
                .keyword(recipeAddRequest.keyword())
                .build();
    }
}
