package com.example.recipe.comment.dto.response;

import com.example.recipe.global.domain.dto.CommentDto;
import com.example.recipe.global.domain.dto.RecipeDto;
import com.example.recipe.global.domain.dto.UserDto;
import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

public record CommentResponse(
        Long id, String content, //int rating,
        UserDto user, RecipeDto recipe
) {
    public static CommentResponse from(Comment comment) {
        User user = comment.getUser();
        UserDto userDto =
                new UserDto(user.getNickname(), user.getPassword(), user.getEMail(),user.getId());
        Recipe recipe = comment.getRecipe();
        RecipeDto recipeDto =
                new RecipeDto(recipe.getId(),
                        recipe.getFoodName(),
                        recipe.getCookingTip(),
                        recipe.getServingSize(),
                        recipe.getLevel(),
                        recipe.getCookingTime(),
                        recipe.getCreateAT(),
                        recipe.getRatingAverage(),
                        recipe.getViews());
        return new CommentResponse(
                comment.getId(),comment.getContent(),userDto,recipeDto
        );
    }
}
