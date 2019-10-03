package com.foundation.gui.umami.entities;

import java.util.Map;

public class Recipe {
    private String title;
    private int preparationTime;
    private int numberOfServings;
    private String dificulty;
    private String summary;
    private String ingredients;
    private String instructions;
    private String saveAs;

    public String getTitle() {
        return title;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public String getDificulty() {
        return dificulty;
    }

    public String getSummary() {
        return summary;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getSaveAs() {
        return saveAs;
    }

    public void fillInformation(Map<String, String> recipeMap) {
        this.title = recipeMap.get("title");
        this.preparationTime = Integer.parseInt(recipeMap.get("preparationTime"));
        this.numberOfServings = Integer.parseInt(recipeMap.get("numberOfServing"));
        this.dificulty = recipeMap.get("difficulty");
        this.summary = recipeMap.get("summary");
        this.ingredients = recipeMap.get("ingredients");
        this.instructions = recipeMap.get("instruction");
        this.saveAs = recipeMap.get("saveAs");
    }
}


