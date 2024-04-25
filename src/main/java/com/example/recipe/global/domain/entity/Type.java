package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TYPES")
public class Type {
    @Id
    @Column(name="TYPES_ID")
    private Long id;
    @Column(name="TYPES_TYPENAME")
    private String typeName;

    @JoinColumn(name="FOOD_RECIPE_ID" )
    @OneToMany(mappedBy = "recipe")
    private Recipe recipe;
}
