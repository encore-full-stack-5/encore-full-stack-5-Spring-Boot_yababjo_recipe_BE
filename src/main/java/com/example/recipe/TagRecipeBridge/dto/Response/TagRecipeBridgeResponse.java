package com.example.recipe.TagRecipeBridge.dto.Response;

import com.example.recipe.global.domain.entity.TagRecipeBridge;

public record TagRecipeBridgeResponse(
        Long id,
        Long recipe_id,
        Long tag_id
) {

    public static TagRecipeBridgeResponse from(TagRecipeBridge tagRecipeBridge){
        return new TagRecipeBridgeResponse(
              tagRecipeBridge.getId(),
              tagRecipeBridge.getRecipe().getId(),
                tagRecipeBridge.getTag().getId()

        );
    }
}
