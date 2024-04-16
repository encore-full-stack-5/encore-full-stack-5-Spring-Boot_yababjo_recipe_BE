package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @JoinColumn(name="FOOD_RECIPE_ID")
    @ManyToOne
    private Recipe recipe;
}