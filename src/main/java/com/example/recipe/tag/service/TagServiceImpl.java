package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.repository.RecipeRepository;

import com.example.recipe.global.domain.repository.TagRepository;
import com.example.recipe.tag.dto.Request.TagRequest;
import com.example.recipe.tag.dto.Response.TagResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TagServiceImpl implements TagService {

    private final RecipeRepository recipeRepository;

    private final TagRepository tagRepository;


    @Override
    public void save(TagRequest tagRequest) {
        Tag tag =  tagRepository.save(tagRequest.toEntity());

    }

    @Override
    public List<Tag> findAll() {
        List<Tag> tags = new ArrayList<>();
        List<Tag> all = tagRepository.findAll();
        tags.addAll(all);

        return tags;
    }

    @Override
    public Tag findById(Long id) {

        return tagRepository.findById(id)
        .orElseThrow(()-> new IllegalArgumentException("없는 태크"));
    }


}
