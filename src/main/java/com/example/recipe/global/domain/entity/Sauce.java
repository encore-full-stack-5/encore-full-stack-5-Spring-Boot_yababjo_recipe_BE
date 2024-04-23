package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "FOOD_SAUCE")
public class Sauce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SAUCE_ID", nullable = false)
    private Long id;

    @Column(name = "SAUCE_NAME", nullable = false)
    private String sauceName;

    @Column(name = "SAUCE_MEASUREMENT")
    private double sauceMeasurement;

    @OneToMany(mappedBy = "sauce")
    private List<SauceRecipeBridge> sauceRecipeBridges;

}
