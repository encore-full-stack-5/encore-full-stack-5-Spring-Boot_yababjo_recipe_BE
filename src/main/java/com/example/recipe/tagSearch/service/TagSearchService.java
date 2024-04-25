package com.example.recipe.tagSearch.service;

import com.example.recipe.global.domain.entity.TagDocument;
import org.elasticsearch.action.search.SearchResponse;

import java.io.IOException;
import java.util.List;

public interface TagSearchService {
    public void saveTag(TagDocument tag);
//    public List<String> searchByKeyword(String keyword) throws IOException;
//    public List<TagDocument> searchTag(String keyword);
public List<String> extractKeywordsFromSearchResponse(SearchResponse response);
//    public List<TagDocument> searchTag(String keyword) throws IOException;
}
