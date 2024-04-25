package com.example.recipe.type.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.Type;
import com.example.recipe.global.domain.repository.TypeRepository;
import com.example.recipe.type.dto.request.TypeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService{

    private final TypeRepository typeRepository;

    @Override
    public void save(TypeRequest typeRequest) {
        Type type = typeRepository.save(typeRequest.toEntity());
    }

    @Override
    public List<Type> findAll() {
        List<Type> types = new ArrayList<>();
        List<Type> all = typeRepository.findAll();
        types.addAll(all);

        return types;
    }

    @Override
    public Type findById(Long id) {
        return typeRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("없는 태크"));
    }

    @Override
    public List<Type> update(TypeRequest typeRequest, Long id) {

        List<Type> types = new ArrayList<>();

        Optional<Type> byId = typeRepository.findById(id);



        return List.of();
    }




}
