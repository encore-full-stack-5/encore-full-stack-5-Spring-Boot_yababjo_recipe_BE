package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter @AllArgsConstructor
@NoArgsConstructor @Builder
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
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;

    public void setOrder(int order){
        this.order = order;
    }

    public void setInstruction(String instruction){
        this.instruction = instruction;
    }
}
