package com.example.recipe.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name="TYPES")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TYPE_ID")
    private Long id;
    @Column(name="TYPE_TYPENAME")@Setter
    private String typeName;


    @OneToMany(mappedBy = "type")
    private List<Recipe> recipe;
}
