package com.example.recipe.tagSearch.controller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import com.example.recipe.global.domain.entity.TagDocument;
import com.example.recipe.global.domain.repository.SearchTagRepository;
import com.example.recipe.tagSearch.service.TagSearchService;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tags")
@RequiredArgsConstructor
public class TagSearchController {
    private final TagSearchService tagSearchService;
    private final RestHighLevelClient elasticsearchClient;

    @PostMapping
    public void createTag(@RequestBody TagDocument tag) {
        tagSearchService.saveTag(tag);
    }
//    @GetMapping("/search")
//    public List<TagDocument> searchTag(@RequestParam("keyword") String keyword) {
//        return tagSearchService.searchTag(keyword);
//    }

//    @GetMapping("/search")
    public List<String> searchTag(String keyword) {
        SearchResponse searchResponse = performElasticsearchSearch(keyword);

        List<String> keywords = tagSearchService.extractKeywordsFromSearchResponse(searchResponse);

        return keywords;
    }

    private SearchResponse performElasticsearchSearch(String keyword) {
        try {
            // 검색 요청을 생성합니다.
            SearchRequest searchRequest = new SearchRequest("tag");

            // 검색 쿼리를 설정합니다. 여기서는 "keyword" 필드에서 주어진 키워드를 검색합니다.
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            searchSourceBuilder.query(QueryBuilders.matchQuery("keyword", keyword));
            searchRequest.source(searchSourceBuilder);

            // Elasticsearch에 검색 요청을 보내고 응답을 받습니다.
            return elasticsearchClient.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            // IOException 발생 시 예외를 처리합니다.
            e.printStackTrace(); // 실제 프로덕션 환경에서는 로깅이나 적절한 예외 처리를 수행해야 합니다.
            return null; // 예외 발생 시 null을 반환하거나 적절한 대체값을 반환합니다.
        }
    }
}
