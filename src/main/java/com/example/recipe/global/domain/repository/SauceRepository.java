package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Sauce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SauceRepository extends JpaRepository<Sauce, Long> {
}
