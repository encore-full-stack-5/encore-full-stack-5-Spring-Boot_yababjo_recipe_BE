package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    // cooking method별 레시피 select
    List<Recipe> findByCookingMethodId(long cookingMethodId);

    // type별 레시피 select
    List<Recipe> findByTypeId(long typeId);

    // 평점 높은 순으로 레시피 정렬


    // LocalDateTime 순으로 정렬
    List<Recipe> findAllByOrderByCreateATDesc();



}
