package com.example.recipe.user.controller;

import com.example.recipe.user.dto.response.UserResponse;
import com.example.recipe.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi/user")
public class UserController {
    @Autowired
    private final UserService userService;

//    public UserResponse Login()

}
