package com.example.recipe.ingredientBridge.service;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
class IngredientBridgeServceImplTest {
  @Autowired
  private IngredientBridgeService ingredientBridgeService;
    @Test
    void save() {
        ingredientBridgeService.save(1L,1L);
    }
}