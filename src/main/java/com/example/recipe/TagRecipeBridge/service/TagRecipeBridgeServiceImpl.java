package com.example.recipe.TagRecipeBridge.service;

import com.example.recipe.TagRecipeBridge.dto.request.TagRecipeBridgeRequest;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.repository.TagRecipeBridgeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagRecipeBridgeServiceImpl implements TagRecipeBridgeService{

    private final TagRecipeBridgeRepository tagRecipeBridgeRepository;

    @Override
    public void save(TagRecipeBridgeRequest tagRecipeBridgeRequest) {
        TagRecipeBridge tagRecipeBridge = tagRecipeBridgeRequest.toEntity();
        tagRecipeBridgeRepository.save(tagRecipeBridge);
    }

    @Override
    public List<TagRecipeBridge> findAll() {
        List<TagRecipeBridge> tagRecipeBridges = new ArrayList<>();
        List<TagRecipeBridge> all = tagRecipeBridgeRepository.findAll();
        tagRecipeBridges.addAll(all);
        return tagRecipeBridges;
    }

    @Override
    public TagRecipeBridge findById(Long id) {
        return tagRecipeBridgeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 태그브릿지"));
    }

    @Override
    public Optional<List<TagRecipeBridge>> findByRecipeId(Long recipeId) {
        List<TagRecipeBridge> allByRecipeId = tagRecipeBridgeRepository.findAllByRecipeId(recipeId);

        if (allByRecipeId.isEmpty()) {
            return Optional.empty(); // 결과가 없는 경우 빈 Optional을 반환

        } else {
            return Optional.of(allByRecipeId); // 결과가 있는 경우 결과를 포함하는 Optional을 반환
        }
    }


}
