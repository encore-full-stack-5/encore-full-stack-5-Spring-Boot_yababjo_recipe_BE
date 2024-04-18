package com.example.recipe.comment.service;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.User;
import com.example.recipe.global.domain.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CommentServiceImplTest {
    Comment comment;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepository commentRepository;
    @Test
    void save() {
        init();
        CommentRequest req = new CommentRequest(
                comment.getContent(),
                comment.getUser().getId(),
                comment.getRecipe().getId()
        );
        commentService.save(req);
    }

    @Test
    void update() {
    }

    @Test
    void getCommentsByRecipeId() {
    }

    @Test
    void getCommentsByUserId() {
    }
    @Transactional
    @BeforeEach
    void init(){
        comment = Comment.builder()
                .user(User.builder().id(1L).build())
                .content("test")
                .recipe(Recipe.builder().id(1L).build())
                .createdAt(null)
                .build();
    }
}