package com.example.recipe.user.service;

import com.example.recipe.global.config.JwtTokenUtils;
import com.example.recipe.global.domain.entity.User;
import com.example.recipe.global.domain.repository.UserRepository;
import com.example.recipe.user.dto.request.UserSignInRequest;
import com.example.recipe.user.dto.request.UserSignUpRequest;
import com.example.recipe.user.dto.response.UserLoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    private final JwtTokenUtils jwtTokenUtils;

    // 회원 가입
    @Override
    public void signUp(UserSignUpRequest req) {
        List<User> byUserName = userRepository.findByNickname(req.nickName());

       // 회원정보가 존재할 때
        if(!byUserName.isEmpty())
            throw new IllegalArgumentException("이미 존재하는 계정입니다");

        User user = req.toEntity();
        userRepository.save(user);
    }

    // 로그인(닉네임,패스워드)
    @Override
    public UserLoginResponse login(UserSignInRequest req) {
        List<User> checkLogin = userRepository.findByNickname(req.nickName());

        // 회원 정보 없을 시
        if(checkLogin.isEmpty())
            throw new IllegalArgumentException("로그인 실패");

        User user = checkLogin.get(0);

        // 비밀번호 불일치
        if(!user.getPassword().equals(req.password()))
            throw new IllegalArgumentException("로그인 실패");
        //토큰 주입
        String token = jwtTokenUtils.createToken(user);
        return new UserLoginResponse(user.getNickname(), user.getEMail(),token);
    }




}
