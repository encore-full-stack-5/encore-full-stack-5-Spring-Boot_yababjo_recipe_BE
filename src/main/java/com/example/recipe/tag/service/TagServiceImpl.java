package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.repository.RecipeRepository;

import com.example.recipe.global.domain.repository.TagRepository;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.dto.response.TagResponse;
import com.example.recipe.tag.dto.response.TagResponseTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public List<TagResponse> findByKeyword(List<String> keywords) {
        List<TagResponse> tagResponses = new ArrayList<>();
        for (String keyword : keywords) {
            List<Tag> tags = tagRepository.findByKeyword(keyword);
            for (Tag tag : tags) {
                tagResponses.add(TagResponse.from(tag));
            }
        }
        return tagResponses;
    }
    @Override
    public Optional<Tag> update(TagRequest tagRequest, Long id) {

        Optional<Tag> byId = tagRepository.findById(id);
        Tag tag = byId.orElseThrow(()-> new IllegalArgumentException("없는 테그"));

        tag.setKeyword(tagRequest.keyword());

       tagRepository.save(tag);

        return Optional.of(tag);
    }

}
