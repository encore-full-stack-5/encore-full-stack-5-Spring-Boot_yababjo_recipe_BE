package com.example.recipe.Sauce.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.global.domain.entity.Sauce;
import com.example.recipe.global.domain.repository.SauceRepository;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SauceServiceImpl implements SauceService{

    private final SauceRepository sauceRepository;

    @Override
    public void save(RecipeAddRequest recipeAddRequest) {
     Sauce sauce = sauceRepository.save(recipeAddRequest.sauceAdd(recipeAddRequest));
    }

    @Override
    public List<Sauce> findAll() {
        List<Sauce> sauces = new ArrayList<>();
        List<Sauce> all = sauceRepository.findAll();
        sauces.addAll(all);

        return sauces;
    }

    @Override
    public Sauce findById(Long id) {

        return sauceRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("없는 소스"));


    }

    @Override
    public Optional<Sauce> update(SauceRequest sauceRequest,Long id) {

        Optional<Sauce> byId = sauceRepository.findById(id);
        Sauce sauce =byId.orElseThrow(()->new IllegalArgumentException("없는 소스"));

       sauce.setSauceName(sauceRequest.sauceName());
       sauce.setSauceMeasurement(sauceRequest.sauceMeasurement());

       sauceRepository.save(sauce);

        return byId;
    }


}
