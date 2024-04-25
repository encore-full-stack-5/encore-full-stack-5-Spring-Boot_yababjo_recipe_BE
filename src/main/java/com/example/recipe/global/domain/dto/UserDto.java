package com.example.recipe.global.domain.dto;

import com.example.recipe.global.domain.entity.User;

public record UserDto(
        Long id,
        String nickname,
        String password,
        String eMail
) {
    public static UserDto toDto(User user) {
        return new UserDto(user.getId(),user.getNickname(), user.getPassword(),user.getEMail());
    }

}
