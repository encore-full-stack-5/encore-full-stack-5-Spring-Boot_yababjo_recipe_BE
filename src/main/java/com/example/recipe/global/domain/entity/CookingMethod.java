package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "COOKING_METHODS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CookingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COOKING_METHOD_ID")
    private Long id;

    @Column(name = "COOKING_METHOD_INDEX")
    private int index;

    @Column(name = "COOKING_METHOD_INSTRUCTION")
    private String instruction;

    @OneToMany(mappedBy = "cookingMethod")
    private List<Recipe> recipes;
}