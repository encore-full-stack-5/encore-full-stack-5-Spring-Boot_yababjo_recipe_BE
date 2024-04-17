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
@Table(name="USERS")
public class User {
    @Id
    @Column(name="USERS_ID")
    private Long id;
    @Column(name="USERS_NICKNAME")
    private String nickname;
    @Column(name="USERS_PASSWORD")
    private String password;
    @Column(name="USERS_EMAIL")
    private String eMail;

    @JoinColumn(name="FOOD_RECIPE_ID")
    @OneToMany(mappedBy = "user")
    private Recipe recipe;

    @JoinColumn(name="COMMENT_ID")
    @OneToMany(mappedBy = "user")
    private Comment comment;

}
