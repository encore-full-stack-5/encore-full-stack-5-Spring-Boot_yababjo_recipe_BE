package com.example.recipe.user.dto.request;

import com.example.recipe.global.domain.entity.User;

public record UserSignUpRequest(
        Long id,
        String nickName,
        String password,
        String eMail
) {
    public User toEntity(){
        return User.builder()
                .id(id)
                .nickname(nickName)
                .password(password)
                .eMail(eMail)
                .build();
    }
}
