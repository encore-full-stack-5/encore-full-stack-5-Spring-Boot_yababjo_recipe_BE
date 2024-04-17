package com.example.recipe.user.service;

import com.example.recipe.global.domain.entity.User;
import com.example.recipe.global.domain.repository.UserRepository;
import com.example.recipe.user.dto.request.UserRequest;
import com.example.recipe.user.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    // 회원 가입


    // 로그인(닉네임,패스워드)
    @Override
    public UserResponse login(UserRequest req) {
        List<User> checkLogin = userRepository.findByNickname(req.nickName());

        // 회원 정보 없을 시
        if(checkLogin.isEmpty())
            throw new IllegalArgumentException("LOGIN FAIL");
        User user = checkLogin.get(0);

        // 비밀번호 불일치
        if(!user.getPassword().equals(req.password()))
            throw new IllegalArgumentException("LOGIN FAIL");

        return new UserResponse(user.getNickname(), user.getEMail());
    }
}
