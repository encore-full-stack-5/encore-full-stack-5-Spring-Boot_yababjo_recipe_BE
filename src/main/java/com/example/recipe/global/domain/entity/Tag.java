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
@Table(name="TAGS")
public class Tag {
    @Id
    @Column(name="TAG_ID")
    private Long id;
    @Column(name="TAG_KEYWORD")
    private String keyword;

    @JoinColumn(name="USER_ID",nullable = false)
    @ManyToOne
    private User user;

    @JoinColumn(name="FOOD_RECIPE_ID" )
//    @OneToMany(mappedBy = "recipe")
    @ManyToOne
    private Recipe recipe;

    @OneToMany(mappedBy = "tag")
    private List<TagRecipeBridge> tagRecipeBridges;

}
