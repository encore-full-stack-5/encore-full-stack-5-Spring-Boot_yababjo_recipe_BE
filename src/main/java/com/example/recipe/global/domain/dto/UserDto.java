package com.example.recipe.global.domain.dto;

public record UserDto(
        String nickname,
        String password,
        String eMail,
        Long id
) {
}
