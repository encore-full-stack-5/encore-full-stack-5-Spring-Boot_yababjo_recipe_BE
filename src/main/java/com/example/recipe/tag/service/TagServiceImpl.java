package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.repository.TagRepository;
import com.example.recipe.tag.dto.Request.TagRequest;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;


    @Override
    public void insertSave(TagRequest req, Long id) {


    }

    @Override
    public List<Tag> showTag() {
        return List.of();
    }
}
