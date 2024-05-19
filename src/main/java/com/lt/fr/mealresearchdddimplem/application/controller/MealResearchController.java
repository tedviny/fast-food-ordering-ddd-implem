package com.lt.fr.mealresearchdddimplem.application.controller;

import com.lt.fr.mealresearchdddimplem.domain.services.MealResearchService;
import com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto.CategoriesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MealResearchController {
    private final MealResearchService mealResearchService = new MealResearchService();

    @GetMapping("/categories/meals")
    public CategoriesResponse getCategoryMeals(){
        return mealResearchService.mealCategories();
    }
}
