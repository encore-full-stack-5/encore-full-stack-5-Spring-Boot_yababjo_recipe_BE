package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FOODINGREDIENTS")
public class FoodIngredient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOODINGREDIENTS_ID")
    private Long id;
    @Setter
    @Column(name = "FOODINGREDIENTS_NAME")
    private String name;
    @Column(name = "FOODINGREDIENTS_TYPE")
    private String type;
    @Column(name = "FOODINGREDIENTS_DES")
    private String description;


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
