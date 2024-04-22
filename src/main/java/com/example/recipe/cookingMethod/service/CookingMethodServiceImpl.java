package com.example.recipe.cookingMethod.service;

import com.example.recipe.comment.dto.response.CommentResponse;
import com.example.recipe.global.domain.entity.CookingMethod;

import java.util.List;

public class CookingMethodServiceImpl implements CookingMethodService{
    @Override
    public List<CookingMethod> getRecipeByCookingMethod(Long id) {
        return commentRepository.findByRecipeId(recipeId)
                .stream()
                .map(CommentResponse::from)
                .toList();
    }
}
