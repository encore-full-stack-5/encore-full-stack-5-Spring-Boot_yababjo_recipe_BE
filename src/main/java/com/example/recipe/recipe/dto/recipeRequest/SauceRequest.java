package com.example.recipe.recipe.dto.recipeRequest;

import com.example.recipe.global.domain.entity.Sauce;

public record SauceRequest (
        Long id,
        String saucename,
        double sauceMeasurement


        ){
    public Sauce toEntity() {
        return Sauce.builder()
                .id(id)
                .sauceName(saucename)
                .sauceMeasurement(sauceMeasurement)
                .build();
    }
}
