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
    User user,
    List<TagRecipeBridge> tagRecipeBridges
) {
    public Tag toEntity(TagRequest request) {
        return Tag.builder()
                .id(request.id()) //
                .keyword(request.keyword()) //
                .user(request.user()) //
                .tagRecipeBridges(request.tagRecipeBridges()) // TagRequest의 tagRecipeBridge 필드 값
                .build();

    }
}
/*
 return Comment.builder()
            .content(content)
            .createdAt(L
            ocalDateTime.now())
            .user(User.builder().id(userId).build())
            .recipe(Recipe.builder().id(recipeId).build())
            .build();
 */