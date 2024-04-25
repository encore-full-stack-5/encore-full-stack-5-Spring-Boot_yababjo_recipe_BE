package com.example.recipe.comment.dto.response;

import com.example.recipe.global.domain.dto.CommentDto;
import com.example.recipe.global.domain.dto.RecipeDto;
import com.example.recipe.global.domain.dto.UserDto;
import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

public record CommentResponse(
        Long id, String content, //int rating,
        Long userId, Long recipeId
) {
    public static CommentResponse from(Comment comment) {

        return new CommentResponse(
                comment.getId(),
                comment.getContent(),
                comment.getUser().getId(),
                comment.getRecipe().getId()
        );
    }

}
