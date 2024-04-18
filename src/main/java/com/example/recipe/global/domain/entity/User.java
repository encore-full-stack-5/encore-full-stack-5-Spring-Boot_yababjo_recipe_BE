package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @Column(name="FOOD_RECIPE_ID")
    @OneToMany(mappedBy = "user")
    private List<Recipe> recipe;

    @Column(name="COMMENT_ID")
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

//    @Column(name="TAG_ID" )
//    @OneToMany(mappedBy = "tag")
//    private List<Tag> tag;

}
