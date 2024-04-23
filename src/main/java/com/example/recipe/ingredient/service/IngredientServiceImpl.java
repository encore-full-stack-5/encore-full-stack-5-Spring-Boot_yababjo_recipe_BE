package com.example.recipe.ingredient.service;

import com.example.recipe.global.domain.entity.FoodIngredient;
import com.example.recipe.global.domain.repository.FoodIngredientsRepository;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.ingredient.dto.response.IngredientResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final FoodIngredientsRepository ingredientsRepository;
    @Override
    public void save(IngredientRequest req) {
        ingredientsRepository.save(req.toEntity());
    }

    @Override

    public List<FoodIngredient> getAll() {

        return ingredientsRepository.findAll();
    }

    @Override
    @Transactional

    public FoodIngredient getById(Long id) {
        Optional<FoodIngredient> byId = Optional.of(ingredientsRepository.getById(id));
        FoodIngredient ingredient = byId.orElse(new FoodIngredient());

        return ingredient;
    }

    @Override
    public String getDescriptionById(Long id) {
        Optional<FoodIngredient> byId = Optional.of(ingredientsRepository.getById(id));
        String description = byId.orElse(new FoodIngredient()).getDescription();


        return description;
    }


    @Override
    @Transactional
    public FoodIngredient update(IngredientRequest req, Long id) {
        Optional<FoodIngredient> ingredientOptional = ingredientsRepository.findById(id);
        if (ingredientOptional.isEmpty()) {
            throw(new IllegalArgumentException(id + " not found"));

        }
        FoodIngredient existingIngredient = ingredientsRepository.getById(id);
        existingIngredient.setName(req.name());
        existingIngredient.setDescription(req.description());
        existingIngredient.setType(req.type());

        return ingredientsRepository.save(existingIngredient);
    }
}
