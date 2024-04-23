package com.example.recipe.type.service;

import com.example.recipe.global.domain.entity.Type;
import com.example.recipe.type.dto.request.TypeRequest;

import java.util.List;
import java.util.Optional;

public interface TypeService{

    void save(TypeRequest typeRequest);
    List<Type> findAll();
    Type findById(Long id);
    List<Type> update(TypeRequest typeRequest,Long id);

}
