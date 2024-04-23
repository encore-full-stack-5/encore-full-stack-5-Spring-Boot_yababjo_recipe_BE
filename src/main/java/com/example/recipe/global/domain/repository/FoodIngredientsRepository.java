package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.FoodIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodIngredientsRepository
        extends JpaRepository<FoodIngredient, Long> {
//    Optional<FoodIngredient> getByName(String name);
}
