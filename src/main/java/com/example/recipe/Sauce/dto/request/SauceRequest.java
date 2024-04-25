package com.example.recipe.Sauce.dto.request;

import com.example.recipe.global.domain.entity.Sauce;

public record SauceRequest(
    String sauceName,
    double sauceMeasurement
) {
    public Sauce toEntity(){
        return  Sauce.builder()
                .sauceMeasurement(this.sauceMeasurement)
                .sauceName(this.sauceName)
                .build();
    }

}
