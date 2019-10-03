package com.foundation.gui.umami.steps;
import com.foundation.gui.umami.entities.Recipe;
import com.foundation.gui.umami.ui.pages.AddRecipePage;
import com.foundation.gui.umami.ui.pages.PageTransporter;
import com.foundation.gui.umami.ui.pages.RecipePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class RecipeStepdefs {

    // Pages
    AddRecipePage addRecipePage;
    RecipePage recipePage;

    // Entities
    private Recipe recipe;

    @When("I go to to the new (.*?) page")
    public void goToPageByPageName(final String pageName) {
        //PageTransporter.goToNewRecipePage();
    }

    @When("I fill the new recipe form with the following description")
    public void fillRecipeForm(final Map<String, String> recipeMap) {
        recipe.fillInformation(recipeMap);

        addRecipePage = new AddRecipePage();
        recipePage = addRecipePage.fillRecipeForm(recipe);
    }

    @Then("the new Recipe's title should be displayed")
    public void theNewRecipeSTitleShouldBeDisplayed() {
        Assert.assertEquals(recipe.getTitle(), recipePage.getRecipeTitle(),
                "The Recipe Title was not displayed");
    }

    @And("the Recipe's difficulty should be displayed")
    public void theRecipeSDescriptionShouldBeDisplayed() {
        Assert.assertEquals(recipe.getDificulty(), recipePage.getDifficulty(),
                "The Recipe Title was not displayed");
    }
}
