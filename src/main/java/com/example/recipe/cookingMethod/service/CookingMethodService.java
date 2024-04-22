package com.example.recipe.cookingMethod.service;

import com.example.recipe.cookingMethod.dto.response.CookingMethodResponse;

import java.util.List;

public interface CookingMethodService {
    // 조리법 별로 음식 보기
    List<CookingMethodResponse> getRecipeByCookingMethod(Long id);
}
