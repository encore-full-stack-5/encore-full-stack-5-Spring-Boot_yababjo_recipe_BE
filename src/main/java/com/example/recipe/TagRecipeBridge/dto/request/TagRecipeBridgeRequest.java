package com.example.recipe.TagRecipeBridge.dto.request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;

public record TagRecipeBridgeRequest(
        Long recipeId,
        Long tagId
) {
    public TagRecipeBridge toEntity() {
        Recipe recipe = Recipe.builder().id(recipeId).build();
        Tag tag = Tag.builder().id(tagId).build();
        return TagRecipeBridge.builder()
                .tag(tag)
                .recipe(recipe)
                .build();
    }
}
