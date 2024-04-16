package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FOODINGREDIENTS")
public class FoodIngredients {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOODINGREDIENTS_ID")
    private Long id;
    @Column(name = "FOODINGREDIENTS_NAME")
    private String name;
    @Column(name = "FOODINGREDIENTS_TYPE")
    private String type;
    @Column(name = "FOODINGREDIENTS_DES")
    private String description;
}
