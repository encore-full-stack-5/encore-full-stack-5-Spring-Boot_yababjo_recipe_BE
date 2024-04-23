package com.example.recipe.SauceRecipeBridge.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.SauceRecipeBridge.dto.request.SauceRecipeBridgeRequest;
import com.example.recipe.global.domain.entity.SauceRecipeBridge;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.repository.SauceRecipeBridgeRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SauceRecipeBridgeServiceImpl implements SauceRecipeBridgeService{

  private final SauceRecipeBridgeRepository sauceRecipeBridgeRepository;

    @Override
    public void save(SauceRecipeBridgeRequest sauceRecipeBridgeRequest) {
        SauceRecipeBridge sauceRecipeBridge = sauceRecipeBridgeRequest.toEntity();
        sauceRecipeBridgeRepository.save(sauceRecipeBridge);
    }

    @Override
    public List<SauceRecipeBridge> findAll() {
        List<SauceRecipeBridge> sauceRecipeBridges = new ArrayList<>();
        List<SauceRecipeBridge> all = sauceRecipeBridgeRepository.findAll();
        sauceRecipeBridges.addAll(all);
        return sauceRecipeBridges;
    }

    @Override
    public SauceRecipeBridge findById(Long id) {
        return sauceRecipeBridgeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 소스브릿지"));
    }

    @Override
    public Optional<List<SauceRecipeBridge>> findByRecipeId(Long recipeId) {
        List<SauceRecipeBridge> allByRecipeId = sauceRecipeBridgeRepository.findAllByRecipeId(recipeId);

        if (allByRecipeId.isEmpty()) {
            return Optional.empty(); // 결과가 없는 경우 빈 Optional을 반환

        } else {
            return Optional.of(allByRecipeId); // 결과가 있는 경우 결과를 포함하는 Optional을 반환
        }
    }
}
