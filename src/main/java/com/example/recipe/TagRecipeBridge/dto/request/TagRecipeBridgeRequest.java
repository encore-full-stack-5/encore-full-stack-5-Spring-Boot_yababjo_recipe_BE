package com.example.recipe.TagRecipeBridge.dto.request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;

public record TagRecipeBridgeRequest(
        Long id,
        Long recipe_id,
        Long tag_id
) {
    public TagRecipeBridge toEntity() {
        Recipe recipe = Recipe.builder().id(recipe_id).build();
        Tag tag = Tag.builder().id(tag_id).build();
        return TagRecipeBridge.builder()
                .id(this.id)
                .tag(tag)
                .recipe(recipe)
                .build();
    }
}
