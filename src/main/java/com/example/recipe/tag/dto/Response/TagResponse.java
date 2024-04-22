package com.example.recipe.tag.dto.Response;


import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.entity.User;

import java.util.List;

public record TagResponse(
        Long id,
        String keyword
){
}
