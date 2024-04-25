package com.example.recipe.user.controller;

import com.example.recipe.global.config.JwtTokenUtils;
import com.example.recipe.global.config.TokenInfo;
import com.example.recipe.user.dto.request.UserSignInRequest;
import com.example.recipe.user.dto.request.UserSignUpRequest;
import com.example.recipe.user.dto.response.UserLoginResponse;
import com.example.recipe.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private final JwtTokenUtils jwtTokenUtils;
    @Autowired
    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody UserSignUpRequest req){
        userService.signUp(req);
    }
    @PostMapping("/login")
    public UserLoginResponse Login(@RequestBody UserSignInRequest req){
        return userService.login(req);
    }

    @GetMapping("/me")
    public TokenInfo getMe(
            @RequestHeader("Authorization") String bearerToken
    ){
        String token = bearerToken.substring(7);
        return jwtTokenUtils.parseToken(token);
    }

}
