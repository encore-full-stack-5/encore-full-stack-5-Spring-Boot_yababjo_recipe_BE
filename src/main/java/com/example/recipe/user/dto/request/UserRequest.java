package com.example.recipe.user.dto.request;

import com.example.recipe.global.domain.entity.User;

public record UserRequest(
        Long id,
        String nickName,
        String password
) {
    public User toEntity(){
        return User.builder()
                .id(id)
                .nickname(nickName)
                .password(password)
                .build();
    }
}
