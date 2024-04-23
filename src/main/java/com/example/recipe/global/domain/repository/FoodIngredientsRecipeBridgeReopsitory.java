package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.FoodIngredientsRecipeBridge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodIngredientsRecipeBridgeReopsitory
        extends JpaRepository<FoodIngredientsRecipeBridge,Long> {
}
