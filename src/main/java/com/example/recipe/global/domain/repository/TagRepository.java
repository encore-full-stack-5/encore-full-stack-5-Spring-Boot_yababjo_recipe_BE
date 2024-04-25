package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Tag;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Long> {
    List<Tag> findByKeyword(String keyword);
}