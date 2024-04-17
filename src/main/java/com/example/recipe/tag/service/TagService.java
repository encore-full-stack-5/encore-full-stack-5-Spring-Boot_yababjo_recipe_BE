package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.tag.dto.Request.TagRequest;

import java.util.List;

public interface TagService {
    void insertSave(TagRequest req, Long id);
    List<Tag> showTag();
}
