package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Builder
@Table(name = "FOOD_RECIPE")
public class Recipe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOOD_RECIPE_ID", nullable = false)
    private int id;

    @Column(name = "FOOD_RECIPE_FOOD_NAME", nullable = false)
    private String foodName;

    @Column(name = "FOOD_RECIPE_TITLE", nullable = false)
    private String recipeTitle;

    @Column(name = "FOOD_RECIPE_COOKING_TIP")
    private int cookingTip;

    @Column(name = "FOOD_RECIPE_SERVING_SIZE")
    private int servingSize;

    @Column(name = "FOOD_RECIPE_LEVEL")
    private int level;

    @Column(name = "FOOD_RECIPE_COOKING_TIME")
    private double cookingTime;

    @Column(name = "FOOD_RECIPE_CREATEAT")
    private LocalDateTime createAT;

    @Column(name = "FOOD_RECIPE_RATING_AVERAGE")
    private double ratingAverage;

    @Column(name = "FOOD_RECIPE_VIEWS")
    private int views;

    @JoinColumn(name="USER_ID", nullable = false)
    @ManyToOne
    private User user;

    @JoinColumn(name="TYPE_ID", nullable = false)
    @ManyToOne
    private Type type;

    @JoinColumn(name="COOKING_METHOD_ID", nullable = false)
    @ManyToOne
    private CookingMethod cookingMethod;

}