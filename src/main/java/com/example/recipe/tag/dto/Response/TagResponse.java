package com.example.recipe.tag.dto.Response;


import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;

public record TagResponse(
        Long id,
        String keyword,
        User user,
        Recipe recipe
){
}
