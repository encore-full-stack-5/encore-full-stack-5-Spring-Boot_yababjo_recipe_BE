package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "SAUCE_RECIPE_BRIDGE")
public class SauceRecipeBridge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SAUCE_RECIPE_BRIDGE_ID", nullable = false)
    private int id;

    @Column(name = "SAUCE_MEASUREMENT")
    private double sauceMeasurement;

    @JoinColumn(name="FOOD_RECIPE_ID", nullable = false)
    @ManyToOne
    private Recipe recipe;

    @JoinColumn(name="SAUCE_ID", nullable = false)
    @ManyToOne
    private Sauce sauce;

}
