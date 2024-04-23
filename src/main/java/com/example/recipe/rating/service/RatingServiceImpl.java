package com.example.recipe.rating.service;

import com.example.recipe.global.domain.entity.Rating;
import com.example.recipe.global.domain.repository.RatingRepository;
import com.example.recipe.rating.dto.request.RatingRequest;
import com.example.recipe.rating.dto.response.RatingResponse;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService{
    private final RatingRepository ratingRepository;
    @Override
    public void save(RatingRequest req) {
        ratingRepository.save(req.toEntity());
    }
    @Override
    public List<RatingResponse> getByRecipeId(Long recipeId) {
        return ratingRepository.findByRecipeId(recipeId)
                .stream()
                .map(RatingResponse::from)
                .toList();
    }
}
