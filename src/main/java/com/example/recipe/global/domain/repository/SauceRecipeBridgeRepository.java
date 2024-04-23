package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.SauceRecipeBridge;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SauceRecipeBridgeRepository
        extends JpaRepository<SauceRecipeBridge,Long>{
    List<SauceRecipeBridge> findAllByRecipeId(Long recipeId);
}
