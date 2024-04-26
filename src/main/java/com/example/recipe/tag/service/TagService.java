package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.tag.dto.request.TagRequest;

import java.util.List;
import java.util.Optional;

public interface TagService{
  void save(RecipeAddRequest recipeAddRequest);
  List<Tag> findAll();
  Tag findById(Long id);
  Optional<Tag> update(TagRequest tagRequest, Long id);
}