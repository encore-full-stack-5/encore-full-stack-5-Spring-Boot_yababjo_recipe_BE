package com.example.recipe.cookingMethod.service;

import com.example.recipe.global.domain.entity.CookingMethod;

import java.util.List;

public interface CookingMethodService {
    // 조리법 별로 음식 보기
    List<CookingMethod> getRecipeByCookingMethod(Long id);
}
