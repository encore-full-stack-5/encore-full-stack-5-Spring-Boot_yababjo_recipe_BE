package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type,Long> {

}
