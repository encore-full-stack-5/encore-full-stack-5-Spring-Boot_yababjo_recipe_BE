package com.example.recipe.Sauce.dto.response;

public record SauceResponse(
        Long id,
        String sauceName,
        double sauceMeasurement
) {
}
