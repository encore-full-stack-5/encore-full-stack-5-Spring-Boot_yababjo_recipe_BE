package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="RATING")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RATING_ID")
    private Long id;

    //    @Column(name = "COMMENT_RATING")
//    private int rating;
    @Column(name = "RATING")
    private double rating;

    @JoinColumn(name="FOOD_RECIPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;

    @JoinColumn(name="USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}