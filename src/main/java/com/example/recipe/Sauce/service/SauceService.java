package com.example.recipe.Sauce.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.global.domain.entity.Sauce;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;

import java.util.List;
import java.util.Optional;

public interface SauceService{

    void save(RecipeAddRequest recipeAddRequest);
    List<Sauce> findAll();
    Sauce findById(Long id);
    Optional<Sauce> update(SauceRequest sauceRequest, Long id);


}

