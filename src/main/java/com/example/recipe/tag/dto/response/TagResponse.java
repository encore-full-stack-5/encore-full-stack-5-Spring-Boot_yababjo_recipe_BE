package com.example.recipe.tag.dto.response;



import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;

import java.util.List;
import java.util.stream.Collectors;

public record TagResponse(
        Long id,
        String keyword,
        List<Long> tagRecipeBridge

){
    public static TagResponse from(Tag tag){
        return new TagResponse(
                tag.getId(),
                tag.getKeyword(),
                tag.getTagRecipeBridges().stream()
                        .map(TagRecipeBridge::getId)
                        .collect(Collectors.toList())
        );

    }

}