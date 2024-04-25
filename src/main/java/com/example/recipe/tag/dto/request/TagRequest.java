package com.example.recipe.tag.dto.request;

import com.example.recipe.global.domain.entity.Tag;


public record TagRequest(
        String keyword,
    Long userId
) {
    public Tag toEntity() {

        return Tag.builder()
                .keyword(keyword)
                .build();

    }
}
