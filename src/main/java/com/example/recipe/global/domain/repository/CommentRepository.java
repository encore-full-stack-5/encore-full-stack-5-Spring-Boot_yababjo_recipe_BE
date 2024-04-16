package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
