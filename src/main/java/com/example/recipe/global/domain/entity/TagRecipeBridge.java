package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "TAG_RECIPE_BRIDGE")
public class TagRecipeBridge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAG_RECIPE_BRIDGE_ID", nullable = false)
    private Long id;

    @JoinColumn(name="FOOD_RECIPE_ID", nullable = false)
    @ManyToOne
    private Recipe recipe;

    @JoinColumn(name="TAG_ID", nullable = false)
    @ManyToOne
    private Tag tag;
}
