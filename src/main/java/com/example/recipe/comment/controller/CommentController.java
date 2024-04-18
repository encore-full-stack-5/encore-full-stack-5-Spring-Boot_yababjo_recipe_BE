package com.example.recipe.comment.controller;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.comment.service.CommentService;
import com.example.recipe.global.domain.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;
    // 내가 쓴 댓글보기, 레시피에 있는 댓글보기, 댓글 쓰기, 댓글 수정
    @PostMapping
    public void save(@RequestBody CommentRequest req) {
        commentService.save(req);
    }
    @GetMapping("/{recipeId}")
    public List<CommentResponse> getByRecipeId(@PathVariable Long recipeId) {
        return commentService.getCommentsByRecipeId(recipeId);
    }
    @GetMapping("/{userId}")
    public List<CommentResponse> getByUserId(@PathVariable Long userId) {
        return commentService.getCommentsByUserId(userId);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CommentRequest req) {
        commentService.update(req, id);
    }
}
