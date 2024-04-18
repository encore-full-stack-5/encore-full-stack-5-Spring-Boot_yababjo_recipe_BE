package com.example.recipe.global.domain.repository;

import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.global.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByRecipeId(long recipeId);

    List<Comment> findByUserId(long userId);
}
