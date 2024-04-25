package com.example.recipe.user.controller;

import com.example.recipe.global.config.JwtTokenUtils;
import com.example.recipe.global.config.TokenInfo;
import com.example.recipe.user.dto.request.UserSignInRequest;
import com.example.recipe.user.dto.request.UserSignUpRequest;
import com.example.recipe.user.dto.response.UserResponse;
import com.example.recipe.user.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import com.example.recipe.global.config.TokenInfo;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/user")
public class UserController {

    private final JwtTokenUtils jwtTokenUtils;

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
