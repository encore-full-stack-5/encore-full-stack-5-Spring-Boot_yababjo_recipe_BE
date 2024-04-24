package com.example.recipe.rating.controller;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.rating.dto.request.RatingRequest;
import com.example.recipe.rating.dto.response.RatingResponse;
import com.example.recipe.rating.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ratings")
@RequiredArgsConstructor
public class RatingController {
    private final RatingService ratingService;
    @PostMapping
    public void save(@RequestBody RatingRequest req) {
        ratingService.save(req);
    }
    @GetMapping("/recipe/{recipeId}")
    public List<RatingResponse> getByRecipeId(@PathVariable Long recipeId) {
        return ratingService.getByRecipeId(recipeId);
    }
}
