package com.example.recipe.user.controller;

import com.example.recipe.user.dto.request.UserSignInRequest;
import com.example.recipe.user.dto.request.UserSignUpRequest;
import com.example.recipe.user.dto.response.UserResponse;
import com.example.recipe.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/user")
public class UserController {
    @Autowired
    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody UserSignUpRequest req){
        userService.signUp(req);
    }
    @PostMapping("/login")
    public UserResponse Login(@RequestBody UserSignInRequest req){
        return userService.login(req);
    }


}
