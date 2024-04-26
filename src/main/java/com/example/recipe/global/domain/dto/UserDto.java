package com.example.recipe.global.domain.dto;

import com.example.recipe.global.domain.entity.User;

public record UserDto(
        Long id,
        String nickname
) {
    public static UserDto toDto(User user) {
        return new UserDto(user.getId(),user.getNickname());
    }

}
