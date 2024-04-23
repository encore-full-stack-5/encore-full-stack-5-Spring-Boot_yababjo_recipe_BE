package com.example.recipe.Sauce.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.global.domain.entity.Sauce;

import java.util.List;
import java.util.Optional;

public interface SauceService{

    void save(SauceRequest sauceRequest);
    List<Sauce> findAll();
    Sauce findById(Long id);
    Optional<Sauce> update(SauceRequest sauceRequest, Long id);


}

