package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.repository.TagRepository;
import com.example.recipe.tag.dto.Request.TagRequest;
import com.example.recipe.tag.dto.Response.TagResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TagServiceImpl implements TagService {


    private final TagRepository tagRepository;

    @Override
    public void save(TagRequest req) {

       Tag tag =  tagRepository.save(new Tag());

    }

    @Override
    public List<Tag> showTag(TagResponse response) {
        return null;

    }

//    }
}
