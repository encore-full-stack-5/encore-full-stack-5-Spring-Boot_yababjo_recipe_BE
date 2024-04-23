package com.example.recipe.tag.controller;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/tag")
@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @PostMapping
    void insertSave(@RequestBody TagRequest req){
        tagService.save(req);
    }

    @GetMapping
    List<Tag> findAll(){

      return  tagService.findAll();
    }



}
