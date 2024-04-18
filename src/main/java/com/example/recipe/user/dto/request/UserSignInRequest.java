package com.example.recipe.user.dto.request;

import com.example.recipe.global.domain.entity.User;

public record UserSignInRequest(
        String nickName,
        String password
) {
    public User toEntity(){
        return User.builder()
                .nickname(nickName)
                .password(password)
                .build();
    }
}
