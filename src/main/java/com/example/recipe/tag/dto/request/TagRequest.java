package com.example.recipe.tag.dto.request;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.User;

public record TagRequest(
    String keyword,
    Long userId
) {
    public Tag toEntity() {
        User user = User.builder().id(userId).build();
        return Tag.builder()
                .keyword(keyword)
                .user(user)
                .build();

    }
}
