package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.tag.dto.Request.TagRequest;
import com.example.recipe.tag.dto.Response.TagResponse;

import java.util.List;

public interface TagService{
  void save(TagRequest req);
  List<Tag> showTag(TagResponse response);
}