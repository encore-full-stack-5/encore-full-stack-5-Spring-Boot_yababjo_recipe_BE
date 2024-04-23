package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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

    public void setCount(int count) {
        this.count = count;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum = ratingSum;
    }

    //    @Column(name = "COMMENT_RATING")
//    private int rating;
    @Column(name = "RATING_SUM")
    private double ratingSum;

    @Column(name = "RATING_COUNT")
    private int count;

    @JoinColumn(name="USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name="FOOD_RECIPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;
}
