package com.example.recipe.user.dto.response;

public record UserLoginResponse(
        String nickname,
        String eMail,
        String token
) {
}
