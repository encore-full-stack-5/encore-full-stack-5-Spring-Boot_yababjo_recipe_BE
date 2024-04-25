package com.example.recipe.Sauce.controller;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.Sauce.service.SauceService;

import com.example.recipe.global.domain.entity.Sauce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/sauce")
@RestController
@RequiredArgsConstructor
public class SauceController {

    private final SauceService sauceService;

    @PostMapping
    public void save(@RequestBody SauceRequest sauceRequest){
        sauceService.save(sauceRequest);
    }

    @GetMapping("/{id}")
    public Sauce findById(@PathVariable("id") Long id){return sauceService.findById(id); }

    @PutMapping("/update/{id}")
    public Optional<Sauce> updateTag(@RequestBody SauceRequest sauceRequest, @PathVariable("id") Long id) {




        return sauceService.update(sauceRequest, id);
    }

    @GetMapping
    public List<Sauce> findALl(){
        return sauceService.findAll();
    }



}
