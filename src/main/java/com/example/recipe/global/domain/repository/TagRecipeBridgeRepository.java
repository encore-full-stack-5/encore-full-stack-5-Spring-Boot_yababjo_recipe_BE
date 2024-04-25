package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.TagRecipeBridge;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TagRecipeBridgeRepository extends JpaRepository<TagRecipeBridge,Long> {

    List<TagRecipeBridge> findAllByRecipeId(Long recipeId);

}
