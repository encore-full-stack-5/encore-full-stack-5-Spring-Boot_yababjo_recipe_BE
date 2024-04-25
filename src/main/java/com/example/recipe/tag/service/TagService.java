package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.dto.response.TagResponse;

import java.util.List;
import java.util.Optional;

public interface TagService{
  void save(TagRequest tagRequest);
  List<Tag> findAll();
  Tag findById(Long id);
  Optional<Tag> update(TagRequest tagRequest, Long id);
  List<TagResponse> findByKeyword(List<String> keyword);

}