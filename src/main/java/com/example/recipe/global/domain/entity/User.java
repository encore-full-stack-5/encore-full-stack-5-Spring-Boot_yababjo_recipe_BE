package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
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
    @OneToMany(mappedBy = "recipe")
    private Recipe recipe;

//    @JoinColumn(name="TAG_ID" )
//    @OneToMany(mappedBy = "tag")
//    private Tag tag;

    @JoinColumn(name="COMMENT_ID")
    @OneToMany(mappedBy = "user")
    private Comment comment;

}
