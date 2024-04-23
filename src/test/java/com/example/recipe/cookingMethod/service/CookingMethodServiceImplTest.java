package com.example.recipe.cookingMethod.service;

import com.example.recipe.comment.dto.request.CommentRequest;
import com.example.recipe.global.domain.entity.*;
import com.example.recipe.global.domain.repository.CookingMethodRepository;
import com.example.recipe.global.domain.repository.RecipeRepository;
import com.example.recipe.global.domain.repository.TypeRepository;
import com.example.recipe.global.domain.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class CookingMethodServiceImplTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TypeRepository typeRepository;
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private CookingMethodRepository cookingMethodRepository;

    @Test
    void getRecipeByCookingMethod() {
//        init();
//        given
        Long id = 3L;
//        when
        List<Recipe> byId = recipeRepository.findByCookingMethodId(id);
//        then
        System.out.println(byId.size());
        assertEquals(4, byId.size());
    }

    @BeforeEach
    void init(){
//        User user = User.builder().id(1L).build();
//        userRepository.save(user);
//        Type type = Type.builder().id(1L).build();
//        typeRepository.save(type);
//
//        for(Long i=2L;i<10;i++){
//            Recipe recipe = Recipe.builder()
//                    .id(i)
//                    .foodName("test"+i)
//                    .recipeTitle("test"+i)
//                    .user(user)
//                    .cookingMethod(CookingMethod.builder().id(3L).build())
//                    .type(type).build();
//            recipeRepository.save(recipe);
//        }
//        assertEquals(3L, recipeRepository.findById(3L).get().getCookingMethod().getId());
    }
}