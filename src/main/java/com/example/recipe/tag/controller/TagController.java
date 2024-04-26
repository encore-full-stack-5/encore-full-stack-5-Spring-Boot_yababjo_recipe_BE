package com.example.recipe.tag.controller;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/tag")
@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @PostMapping
//    public void save(@RequestBody TagRequest tagRequest){
//        tagService.save(tagRequest);
//    }

    @GetMapping("/{id}")
    public Tag findById(@PathVariable("id") Long id){return tagService.findById(id); }

    @PutMapping("/update/{id}")
    public Optional<Tag> updateTag(@RequestBody TagRequest tagRequest, @PathVariable("id") Long id) {

        return  tagService.update(tagRequest, id);
    }

    @GetMapping
    public List<Tag> findALl(){
        return tagService.findAll();
    }







}
