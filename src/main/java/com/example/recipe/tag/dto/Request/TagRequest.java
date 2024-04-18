package com.example.recipe.tag.dto.Request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.User;
import jakarta.persistence.*;

public record TagRequest(
    Long id,
    String keyword,
    User user,
    Recipe recipe
) {
}
