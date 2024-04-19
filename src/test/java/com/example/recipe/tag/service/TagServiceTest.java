package com.example.recipe.tag.service;

import com.example.recipe.global.domain.entity.Tag;
import com.example.recipe.global.domain.entity.User;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.global.domain.repository.TagRepository;

import com.example.recipe.global.domain.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TagServiceTest {

    protected List<Tag> tagTest;

    protected RecipeRepository recipeRepository;
    protected UserRepository userRepository;
    protected TagRepository tagRepository;
    protected Tag

    @Test
    void init(){
//        tagTest = new ArrayList<>();
//
//
//        for(long i=0; i<10; i++) {
//            Tag tag = Tag.builder()
//                    .id(i)
//                    .keyword("good"+i)
//                    .tagRecipeBridges()
//                    .user()
//                    .build();
//            Tag savedTag = tagRepository.save(tag);
//            tagTest.add(savedTag);
//        }
//
//        System.out.println(tagTest.get(0).getKeyword());
    }


//    @Test
//    void save() {
//
//        //given
//
//      Tag testTga = Tag.builder().id(2l).keyword("good2").build();
//
//
//        //when&then
//        List<Tag> tags = tagRepository.findAllById();
//        Assertions.assertEquals("good2",tags.get(2).getKeyword());
//
//
//    }
}