package com.lt.fr.mealresearchdddimplem.application.controller;

import com.lt.fr.mealresearchdddimplem.MealResearchDddImplApplication;
import com.lt.fr.mealresearchdddimplem.domain.services.MealResearchService;
import com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto.CategoriesResponse;
import com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = MealResearchDddImplApplication.class)
public class MealResearchControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @MockBean
    private MealResearchService mealResearchService;

    @Test
    public void getCategoryMeals_shouldReturnSuccess() throws Exception {

        // Setup MockMvc
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();

        // Given
        Category fishCategory = new Category("1", "Fish", "https://www.themealdb.com/images/category/fish.png", "Fish is good");

        Category poultryCategory = new Category("2", "Poultry", "https://www.themealdb.com/images/category/poultry.png", "Poultry is very delicious");

        CategoriesResponse categoriesResponse = new CategoriesResponse(Arrays.asList(fishCategory, poultryCategory));

        given(mealResearchService.mealCategories()).willReturn(categoriesResponse);

        // When and Then
        mockMvc.perform(get("/api/v1/categories/meals")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());


    }

    @Test
    public void getCategoryMeals_shouldReturnNotFound() throws Exception {

        // Setup MockMvc
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();

        // Given
        Category fishCategory = new Category("1", "Fish", "https://www.themealdb.com/images/category/fish.png", "Fish is good");

        Category poultryCategory = new Category("2", "Poultry", "https://www.themealdb.com/images/category/poultry.png", "Poultry is very delicious");

        CategoriesResponse categoriesResponse = new CategoriesResponse(Arrays.asList(fishCategory, poultryCategory));

        given(mealResearchService.mealCategories()).willReturn(categoriesResponse);

        // When and Then
        mockMvc.perform(get("/api/v1/categories/bad")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());

    }

}
