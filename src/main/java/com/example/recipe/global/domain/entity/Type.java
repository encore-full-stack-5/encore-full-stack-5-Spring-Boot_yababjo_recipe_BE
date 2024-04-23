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
@Table(name="TYPES")
public class Type {
    @Id
    @Column(name="TYPE_ID")
    private Long id;
    @Column(name="TYPE_TYPENAME")
    private String typeName;


    @OneToMany(mappedBy = "type")
    private List<Recipe> recipe;
}
