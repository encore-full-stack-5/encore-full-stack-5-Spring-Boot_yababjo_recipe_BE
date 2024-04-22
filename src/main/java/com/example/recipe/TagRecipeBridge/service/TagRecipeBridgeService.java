package com.example.recipe.TagRecipeBridge.service;

import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.global.domain.entity.TagRecipeBridge;

import java.util.List;

public interface TagRecipeBridgeService {

    void save(TagRecipeBridgeRequest tagRecipeBridgeRequest);
    List<TagRecipeBridge> findAll();
    TagRecipeBridge findById(Long id);


}
