package com.example.recipe.user.service;

import com.example.recipe.user.dto.request.UserSignInRequest;
import com.example.recipe.user.dto.request.UserSignUpRequest;
import com.example.recipe.user.dto.response.UserResponse;

public interface UserService {
    UserResponse login(UserSignInRequest req); // 로그인
    void signUp(UserSignUpRequest req);

}
