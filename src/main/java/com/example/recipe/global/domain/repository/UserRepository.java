package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByNickname(String nickname);
}
