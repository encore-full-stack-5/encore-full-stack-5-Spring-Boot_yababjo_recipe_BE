package com.example.recipe.comment.service;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.global.domain.entity.Comment;
import jakarta.transaction.Transactional;

import java.util.List;

public interface CommentService {
//     저장
    void save(CommentRequest req);
//    수정
    Comment update(CommentRequest req, Long id);
//    게시글 댓글 불러오기
    List<CommentResponse> getCommentsByRecipeId(long recipeId);
//    내가 쓴 댓글 불러오기
    List<CommentResponse> getCommentsByUserId(long userId);
}
