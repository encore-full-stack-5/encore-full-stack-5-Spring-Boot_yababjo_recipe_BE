package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;

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
    @Column(name = "SAUCE_ID")
    private Long id;

    @Column(name = "SAUCE_NAME")@Setter
    private String sauceName;

    @Column(name = "SAUCE_MEASUREMENT")@Setter
    private double sauceMeasurement;

    @OneToMany(mappedBy = "sauce")
    private List<SauceRecipeBridge> sauceRecipeBridges;

}
