package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.CookingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookingMethodRepository extends JpaRepository<CookingMethod, Long> {
}
