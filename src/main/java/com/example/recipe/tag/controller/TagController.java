package com.example.recipe.tag.controller;

import com.example.recipe.tag.dto.Request.TagRequest;
import com.example.recipe.tag.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @PostMapping
    void insertSave(@RequestBody TagRequest req){
        tagService.save(req);
    }

}
