package com.example.recipe.tag.controller;

import com.example.recipe.tag.dto.Request.TagRequest;
import com.example.recipe.tag.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @GetMapping
    void insertSave(@RequestBody TagRequest req){

//        tagService.insertSave();

    }

}
