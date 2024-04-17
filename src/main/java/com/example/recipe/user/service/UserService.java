package com.example.recipe.user.service;

import com.example.recipe.user.dto.request.UserRequest;
import com.example.recipe.user.dto.response.UserResponse;

public interface UserService {
    UserResponse login(UserRequest req); // 로그인
}
