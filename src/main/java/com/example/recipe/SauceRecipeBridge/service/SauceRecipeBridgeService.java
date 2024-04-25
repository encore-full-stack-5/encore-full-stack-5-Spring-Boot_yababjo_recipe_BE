package com.example.recipe.SauceRecipeBridge.service;

import com.example.recipe.SauceRecipeBridge.dto.request.SauceRecipeBridgeRequest;
import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.global.domain.entity.SauceRecipeBridge;
import com.example.recipe.global.domain.entity.TagRecipeBridge;

import java.util.List;
import java.util.Optional;

public interface SauceRecipeBridgeService {

    void save(SauceRecipeBridgeRequest sauceRecipeBridgeRequest);
    List<SauceRecipeBridge> findAll();
    SauceRecipeBridge findById(Long id);
    Optional<List<SauceRecipeBridge>> findByRecipeId(Long recipeId);
}
