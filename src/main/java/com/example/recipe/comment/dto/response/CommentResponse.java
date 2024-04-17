package com.example.recipe.comment.dto.response;

import com.example.recipe.global.domain.dto.CommentDto;
import com.example.recipe.global.domain.dto.RecipeDto;
import com.example.recipe.global.domain.dto.UserDto;
import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.User;

public record CommentResponse(
        Long id, String content, int rating,
        UserDto user, RecipeDto recipe
) {
    public static CommentResponse from(Comment comment) {
        User user = comment.getUser();
        UserDto userDto =
                new UserDto(user.getId(),user.getNickname(), user.getEMail());
    }
}
