package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="COMMENTS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMENT_ID")
    private Long id;
//    @Column(name = "COMMENT_RATING")
//    private int rating;
    @Column(name = "COMMENT_CONTENT")
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "COMMENT_CREATED_AT")
    private LocalDateTime createdAt;

    @JoinColumn(name="USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name="FOOD_RECIPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;
}
