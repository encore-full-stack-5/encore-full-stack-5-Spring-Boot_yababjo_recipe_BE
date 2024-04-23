package com.example.recipe.Sauce.dto.request;

import com.example.recipe.global.domain.entity.Sauce;

public record SauceRequest(
    Long id,
    String sauceName,
    double sauceMeasurement
) {
    public Sauce toEntity(){
        return  Sauce.builder()
                .id(this.id)
                .sauceMeasurement(this.sauceMeasurement)
                .sauceName(this.sauceName)
                .build();
    }

}
