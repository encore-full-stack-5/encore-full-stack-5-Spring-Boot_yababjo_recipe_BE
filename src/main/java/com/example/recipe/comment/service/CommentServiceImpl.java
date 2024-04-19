package com.example.recipe.comment.service;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.global.domain.entity.Comment;
import com.example.recipe.global.domain.repository.CommentRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.global.domain.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;
    @Override
    public void save(CommentRequest req) {
        commentRepository.save(req.toEntity());
    }

    @Override
    @Transactional
    public Comment update(CommentRequest req, Long id) {
        Comment comment = commentRepository.findById(id).orElseThrow(
                EntityNotFoundException::new);
        comment.setContent(req.content());
        return comment;
    }

    @Override
    public List<CommentResponse> getCommentsByRecipeId(long recipeId) {
        return commentRepository.findByRecipeId(recipeId)
                .stream()
                .map(CommentResponse::from)
                .toList();
    }

    @Override
    public List<CommentResponse> getCommentsByUserId(long userId) {
        return commentRepository.findByUserId(userId)
                .stream()
                .map(CommentResponse::from)
                .toList();
    }

}
