package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.SauceRecipeBridge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SauceRecipeBridgeReopsitory
        extends JpaRepository<SauceRecipeBridge,Long>{
}
