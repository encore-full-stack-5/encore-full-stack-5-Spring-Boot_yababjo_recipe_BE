package com.example.recipe.global.domain.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "tags")
public class TagDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Field(type = FieldType.Text)
    private String keyword;

    public TagDocument(Long id, String keyword) {
        this.id = id;
        this.keyword = keyword;
    }

    // Tag 엔티티에서 TagDocument로 변환하는 메서드
    public static TagDocument fromTagEntity(Tag tag) {
        return new TagDocument(tag.getId(), tag.getKeyword());
    }
}
