package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}

