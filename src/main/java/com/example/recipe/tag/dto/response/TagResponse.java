package com.example.recipe.tag.dto.response;



import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.entity.User;

import java.util.List;

public record TagResponse(
        Long id,
        String keyword,
        List<TagRecipeBridge> tagRecipeBridge

){
    public static TagResponse form(Tag tag){
        return new TagResponse(
                tag.getId(),
                tag.getKeyword(),
                tag.getTagRecipeBridges()
        );

    }

}
