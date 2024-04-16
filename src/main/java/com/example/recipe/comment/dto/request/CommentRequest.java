package com.example.recipe.comment.dto.request;

import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

import java.time.LocalDateTime;

public record CommentRequest(
        String content,
        int rating,
        Long userId,
        Long recipeId
) {
    public Comment toEntity(User user, Recipe recipe) {
        return Comment.builder()
                .content(content)
                .rating(rating)
                .recipe(recipe)
                .user(user)
                .createdAt(LocalDateTime.now())
                .build();
    }
}
