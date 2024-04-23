package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.CookingOrder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CookingOrderRepository
        extends JpaRepository<CookingOrder, Long> {
}
