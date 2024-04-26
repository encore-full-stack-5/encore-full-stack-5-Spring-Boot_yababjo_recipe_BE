package com.example.recipe.recipe.service;

import com.example.recipe.Sauce.dto.request.SauceRequest;
import com.example.recipe.Sauce.service.SauceServiceImpl;
import com.example.recipe.SauceRecipeBridge.service.SauceRecipeBridgeServiceImpl;
import com.example.recipe.TagRecipeBridge.service.TagRecipeBridgeServiceImpl;
import com.example.recipe.global.domain.entity.*;
import com.example.recipe.global.domain.repository.*;
import com.example.recipe.ingredient.dto.request.IngredientRequest;
import com.example.recipe.ingredient.service.IngredientServiceImpl;
import com.example.recipe.order.dto.request.OrderRequest;
import com.example.recipe.recipe.dto.recipeRequest.RecipeAddRequest;
import com.example.recipe.recipe.dto.response.RecipeResponse;
import com.example.recipe.tag.dto.request.TagRequest;
import com.example.recipe.tag.service.TagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private final TypeRepository typeRepository;
    private final CookingMethodRepository cookingMethodRepository;
    private final TagRepository tagRepository;

    private final FoodIngredientsRepository foodIngredientsRepository;
    private final FoodIngredientsRecipeBridgeReopsitory foodIngredientsRecipeBridgeReopsitory;
    private final SauceRepository sauceRepository;
    private final SauceRecipeBridgeRepository sauceRecipeBridgeRepository;
    private final CookingOrderRepository cookingOrderRepository;

    private final IngredientServiceImpl ingredientService;

    private final SauceServiceImpl sauceService;
    private final SauceRecipeBridgeServiceImpl sauceRecipeBridgeService;
    private final TagServiceImpl tagService;
    private final TagRecipeBridgeServiceImpl tagRecipeBridgeService;
    private final UserRepository userRepository;

    @Override
    public void addRecipe(
            RecipeAddRequest recipeAddRequest
//          SauceRecipeBridgeRequest sauceRecipeBridgeRequest,
//          TagRecipeBridgeRequest tagRecipeBridgeRequests
    )   {
        /*
            저장해야 할 repository
            레시피, 재료브릿지, 재료 ,소스브릿지 , 소스
            조리 순서, 태그
         */
        recipeRepository.save(recipeAddRequest.toEntity());

        Tag tag = recipeAddRequest.tagAdd(recipeAddRequest);
        tagRepository.save(tag);

        Sauce sauce = recipeAddRequest.sauceAdd(recipeAddRequest);
        sauceRepository.save(sauce);
    }

//    @Override
//    public void addother(
//            OrderRequest orderReqs,
//            IngredientRequest ingredientRequests,
//            SauceRequest sauceRequests,
//            TagRequest tagRequests
//            ) {
//        cookingOrderRepository.save(orderReqs.toEntity());
//
//        ingredientService.save(ingredientRequests);
//        // 재료 브릿지 서비스 필요
//
//        sauceService.save(sauceRequests);
//
//        tagService.save(tagRequests);
////        sauceRecipeBridgeService.save(sauceRecipeBridgeRequest);
////        tagRecipeBridgeService.save(tagRecipeBridgeRequests);
//
//    }
    @Override
    public List<RecipeResponse> getRecipesSortedByCreateAt() {
        return recipeRepository.findAllByOrderByCreateATDesc()
                .stream()
                .map(RecipeResponse::from)
                .toList();
    }


    @Override
    public List<RecipeResponse> getRecipesSortedByTypeId(Long typeID) {
        Optional<Type> typeOptional = typeRepository.findById(typeID);

        if (typeOptional.isPresent()) {
            Type type = typeOptional.get();
            return type.getRecipe().stream().map(
                    RecipeResponse::from
            ).toList();
        } else {
            return Collections.emptyList();
        }
    }



    @Override
    public List<RecipeResponse> getByCookingMethodId(Long cookingMethodId) {
        Optional<CookingMethod> cookingMethodOptional = cookingMethodRepository.findById(cookingMethodId);

        if (cookingMethodOptional.isPresent()) {
            CookingMethod cookingMethod = cookingMethodOptional.get();
            return cookingMethod.getRecipes().stream().map(
                    RecipeResponse::from
            ).toList();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public List<RecipeResponse> getRecipesByUserId(Long userId) {
//        Long id = new User().getId();
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
           return user.getRecipe().stream().map(
                   RecipeResponse::from
           ).toList();
        } else {
            return  Collections.emptyList();
        }
    }

    @Override
    public Recipe getRecipeById(Long recipeId) {
        return recipeRepository.findById(recipeId)
                .orElseThrow(()-> new IllegalArgumentException("없는 태크"));


    }
}
