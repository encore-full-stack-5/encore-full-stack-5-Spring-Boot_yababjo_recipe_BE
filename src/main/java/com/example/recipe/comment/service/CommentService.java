package com.example.recipe.comment.service;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.comment.dto.response.CommentResponse;

import java.util.List;

public interface CommentService {
    void save(CommentRequest req);
    List<CommentResponse> getAll();
}
