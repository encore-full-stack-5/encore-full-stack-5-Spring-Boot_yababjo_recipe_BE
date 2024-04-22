package com.example.recipe.cookingMethod.service;

import com.example.recipe.cookingMethod.dto.response.CookingMethodResponse;
import com.example.recipe.global.domain.repository.CookingMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CookingMethodServiceImpl implements CookingMethodService{
    private final CookingMethodRepository cookingMethodRepository;
    @Override
    public List<CookingMethodResponse> getRecipeByCookingMethod(Long id) {
        return cookingMethodRepository.findById(id)
                .stream()
                .map(CookingMethodResponse::from)
                .toList();
    }
}
