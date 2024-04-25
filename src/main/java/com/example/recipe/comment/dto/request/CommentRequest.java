package com.example.recipe.comment.dto.request;

import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

import java.time.LocalDateTime;

public record CommentRequest(
        String content,
//        int rating,
        Long userId,
        Long recipeId
) {
    public Comment toEntity() {
//        User user = new User(userId, null, null,
//                null, null,null,null);
//        return Comment.builder()
//                .content(content)
////                .rating(rating)
//                .recipe(new Recipe(recipeId,null,null,null,0,
//                        0,0,null,0,0,user,null,null,null,null,null,null))
//                .user(user)
//                .createdAt(LocalDateTime.now())
//                .build();
        return Comment.builder()
                .content(content)
                .createdAt(LocalDateTime.now())
                .user(User.builder().id(userId).build())
                .recipe(Recipe.builder().id(recipeId).build())
                .build();
    }
}
