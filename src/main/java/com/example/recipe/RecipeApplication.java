package com.example.recipe;

import com.example.recipe.global.domain.repository.SearchTagRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(
		includeFilters = {
				@ComponentScan
						.Filter(type = FilterType.ASSIGNABLE_TYPE, classes =
						SearchTagRepository.class),
		}
)
public class RecipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}

}
