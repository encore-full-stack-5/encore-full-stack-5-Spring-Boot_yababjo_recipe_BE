package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Getter @AllArgsConstructor
@NoArgsConstructor
@Table(name = "COOKINGORDERS")
public class CookingOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COOKINGORDERS_ID")
    private Long id;
    @Column(name = "COOKINGORDERS_ORDER")
    private int order;
    @Column(name = "COOKINGORDERS_INSTRUCTION")
    private String instruction;
    @JoinColumn(name="FOOD_RECIPE_ID")
    @ManyToOne
    private Recipe recipe;


}
