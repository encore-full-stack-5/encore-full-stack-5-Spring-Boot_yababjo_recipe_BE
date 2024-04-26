package com.example.recipe.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;

@Configuration
public class ElasticSearchConfig {

    @Bean
    public RestHighLevelClient elasticSearchClient() {
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.80.37", 9200, "http")));
    }
}
