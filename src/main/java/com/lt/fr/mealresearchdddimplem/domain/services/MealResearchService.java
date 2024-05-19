package com.lt.fr.mealresearchdddimplem.domain.services;

import com.lt.fr.mealresearchdddimplem.infrastructure.provider.MealResearchProvider;
import com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto.CategoriesResponse;
import org.springframework.stereotype.Service;


@Service
public class MealResearchService {
    private final MealResearchProvider mealResearchProvider = new MealResearchProvider();

    public CategoriesResponse mealCategories(){
        return mealResearchProvider.getMealCategories();
    }
}
