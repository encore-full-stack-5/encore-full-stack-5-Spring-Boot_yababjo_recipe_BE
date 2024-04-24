package com.example.recipe.rating.service;

import com.example.recipe.global.domain.entity.Rating;
import com.example.recipe.rating.dto.request.RatingRequest;
import com.example.recipe.rating.dto.response.RatingResponse;

import java.util.List;

public interface RatingService {
    void save(RatingRequest req);
    List<RatingResponse> getByRecipeId(Long recipeId);
}
