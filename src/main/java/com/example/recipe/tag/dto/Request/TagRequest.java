package com.example.recipe.tag.dto.Request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.entity.User;
import jakarta.persistence.*;

import java.util.List;

public record TagRequest(
    Long id,
    String keyword,
    Long userId
) {
    public Tag toEntity() {
        User user = User.builder().id(userId).build();
        return Tag.builder()
                .id(this.id)
                .keyword(this.keyword)
                .user(user)
                .build();

    }
}
