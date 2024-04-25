package com.example.recipe.tagSearch.service;

import com.example.recipe.global.domain.entity.TagDocument;
import com.example.recipe.global.domain.repository.SearchTagRepository;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TagSearchServiceImpl implements TagSearchService {
    private final SearchTagRepository searchTagRepository;
    @Autowired
    private RestHighLevelClient client;

    public void saveTag(TagDocument tag) {
        searchTagRepository.save(tag);
    }

//    public List<String> searchByKeyword(String keyword) throws IOException {
//        // Elasticsearch의 인덱스명
//        String index = "tag";
//
//        // 검색 요청 생성
//        SearchRequest searchRequest = new SearchRequest(index);
//        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//
//        // 쿼리 생성: 여기서는 키워드를 기반으로 match 쿼리를 생성합니다.
//        searchSourceBuilder.query(QueryBuilders.matchQuery("*", keyword));
//
//        // 결과를 score에 따라 내림차순으로 정렬합니다.
//        searchSourceBuilder.sort("_score", SortOrder.DESC);
//
//        // 검색 요청에 쿼리 설정
//        searchRequest.source(searchSourceBuilder);
//
//        // Elasticsearch로 검색 요청 보내기
//        SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
//
//        // 검색 결과 처리
//        List<String> resultList = new ArrayList<>();
//        response.getHits().forEach(hit -> {
//            String sourceAsString = hit.getSourceAsString();
//            // 검색 결과를 리스트에 추가
//            resultList.add(sourceAsString);
//        });
//
//        return resultList;
//    }

    public List<String> extractKeywordsFromSearchResponse(SearchResponse response) {
        List<String> keywords = new ArrayList<>();

        // Elasticsearch 검색 응답에서 검색 결과 추출
        SearchHit[] hits = response.getHits().getHits();
        for (SearchHit hit : hits) {
            // 각 검색 결과에서 "_source" 필드의 내용을 가져와서 JSON 형식으로 변환
            String sourceAsString = hit.getSourceAsString();

            // JSON 형식의 문자열에서 "keyword" 필드의 값을 추출하여 리스트에 추가
            String keyword = extractKeywordFromJson(sourceAsString);
            keywords.add(keyword);
        }

        return keywords;
    }

    private String extractKeywordFromJson(String json) {
        // 여기서는 JSON 파싱 라이브러리를 사용하여 "keyword" 필드의 값을 추출하도록 합니다.
        // 예를 들어, Jackson 라이브러리를 사용하여 JSON을 파싱할 수 있습니다.
        // 여기서는 간단하게 문자열 처리를 사용하여 "keyword" 필드의 값을 추출합니다.
        int start = json.indexOf("\"keyword\"") + 11; // "keyword" 문자열 다음부터 값이 시작함을 가정
        int end = json.indexOf("\"", start); // 다음 큰따옴표가 나올 때까지가 값의 끝
        return json.substring(start, end);
    }
}
