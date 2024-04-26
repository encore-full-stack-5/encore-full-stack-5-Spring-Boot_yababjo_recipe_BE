package com.example.recipe.tag.dto.response;



import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.TagRecipeBridge;
import com.example.recipe.global.domain.entity.User;
import org.elasticsearch.common.recycler.Recycler;

import java.util.List;
import java.util.stream.Collectors;

public record TagResponseTest(
        Long id,
        String keyword,
        List<Long> tagRecipeBridge,
        String Title

){
    public static TagResponseTest from(Tag tag, List<Recipe> recipe){
        TagResponseTest tagResponseTest = new TagResponseTest(
                tag.getId(),
                tag.getKeyword(),
                tag.getTagRecipeBridges().stream()
                        .map(TagRecipeBridge::getId)
                        .collect(Collectors.toList()),
                recipe.stream().map(Recipe::getRecipeTitle)
                        .collect(Collectors.joining())
        );
        return tagResponseTest;

    }

}
