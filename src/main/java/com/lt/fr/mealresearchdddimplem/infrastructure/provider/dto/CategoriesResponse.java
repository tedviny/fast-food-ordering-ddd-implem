package com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CategoriesResponse {
    @JsonProperty("categories")
    private List<Category> categories;

    @JsonCreator
    public CategoriesResponse(@JsonProperty("categories") List<Category> categories) {
        this.categories = categories;
    }


    public List<Category> getCategories() {
        return categories;
    }

}
