package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TAGS")
public class Tag {
    @Id
    @Column(name="TAG_ID")
    private Long id;
    @Column(name="TAG_KEYWORD")
    private String keyword;

    @JoinColumn(name="FOOD_RECIPE_ID" )
    @OneToMany(mappedBy = "recipe")
    private Recipe recipe;
}
