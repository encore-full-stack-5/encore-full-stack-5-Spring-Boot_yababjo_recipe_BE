package com.example.recipe.user.dto.request;

import com.example.recipe.global.domain.entity.User;

public record UserSignUpRequest(
        String nickName,
        String password,
        String eMail
) {
    public User toEntity(){
        return User.builder()
                .nickname(nickName)
                .password(password)
                .eMail(eMail)
                .build();
    }
}
