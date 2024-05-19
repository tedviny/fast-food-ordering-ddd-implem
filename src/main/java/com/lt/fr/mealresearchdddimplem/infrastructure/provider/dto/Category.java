package com.lt.fr.mealresearchdddimplem.infrastructure.provider.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty("idCategory")
    private String idCategory;

    @JsonProperty("strCategory")
    private String strCategory;

    @JsonProperty("strCategoryThumb")
    private String strCategoryThumb;

    @JsonProperty("strCategoryDescription")
    private String strCategoryDescription;

    @JsonCreator
    public Category(@JsonProperty("idCategory") String idCategory,
                    @JsonProperty("strCategory") String strCategory,
                    @JsonProperty("strCategoryThumb") String strCategoryThumb,
                    @JsonProperty("strCategoryDescription") String strCategoryDescription) {
        this.idCategory = idCategory;
        this.strCategory = strCategory;
        this.strCategoryThumb = strCategoryThumb;
        this.strCategoryDescription = strCategoryDescription;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getStrCategory() {
        return strCategory;
    }


    public String getStrCategoryThumb() {
        return strCategoryThumb;
    }

    public String getStrCategoryDescription() {
        return strCategoryDescription;
    }

}
