package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRecipeId(long recipeId);
}
