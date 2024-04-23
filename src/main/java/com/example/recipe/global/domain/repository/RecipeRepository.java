package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByCookingMethodId(long cookingMethodId);
}
