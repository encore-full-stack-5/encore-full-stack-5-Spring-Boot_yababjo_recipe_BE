package com.example.recipe.global.domain.repository;

import com.example.recipe.global.domain.entity.TagDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchTagRepository extends ElasticsearchRepository<TagDocument,Long> {
    List<TagDocument> findByKeywordContaining(String keyword);
}
