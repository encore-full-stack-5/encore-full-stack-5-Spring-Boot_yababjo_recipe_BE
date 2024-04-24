package com.example.recipe.type.dto.request;

import com.example.recipe.global.domain.entity.Recipe;
import com.example.recipe.global.domain.entity.Type;

import java.util.List;

public record TypeRequest(
        String typeName

) {
    public Type toEntity(){

        return Type.builder()
                .typeName(typeName)
                .build();

    }

}
