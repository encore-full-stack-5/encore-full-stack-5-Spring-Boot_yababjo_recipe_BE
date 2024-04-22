package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.FoodIngredientsRecipeBridge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodIngredientsRepository extends JpaRepository<FoodIngredientsRecipeBridge, Long> {
}
