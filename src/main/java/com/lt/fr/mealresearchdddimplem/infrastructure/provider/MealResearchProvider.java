package com.lt.fr.mealresearchdddimplem.infrastructure.provider;

import com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto.CategoriesResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

public class MealResearchProvider {
    private final Logger logger = Logger.getLogger(MealResearchProvider.class.toString());

    WebClient webClient = WebClient.create();

    public CategoriesResponse getMealCategories() {

        final String url = "https://www.themealdb.com/api/json/v1/1/categories.php";

        Mono<CategoriesResponse> response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(CategoriesResponse.class);

        CategoriesResponse categoriesResponse = response.block();

        return categoriesResponse;

    }
}
