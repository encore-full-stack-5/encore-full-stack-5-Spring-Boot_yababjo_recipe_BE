package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.repository.TagRepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TagServiceTest {
    @Autowired
    protected Tag tag;

    @Autowired
    protected TagRepository tagRepository;

    @Test
    @BeforeEach
    void init(){

        for(long i=0;i<10;i++){

        tag = Tag.builder().id(i).keyword("good"+i).build();

                tagRepository.save(tag);
        }

    }


    @Test
    void save() {

        //given

      Tag testTga = Tag.builder().id(2l).keyword("good2").build();

        //when&then
        List<Tag> tags = tagRepository.findAllById();
        Assertions.assertEquals("good2",tags.get(2).getKeyword());


    }
}