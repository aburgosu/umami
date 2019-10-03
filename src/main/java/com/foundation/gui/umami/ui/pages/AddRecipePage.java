package com.foundation.gui.umami.ui.pages;

import com.foundation.gui.umami.entities.Recipe;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddRecipePage extends BasePage {

    @FindBy(css = "input#edit-title-0-value")
    WebElement title;
    @FindBy(css = "input#edit-field-preparation-time-0-value")
    WebElement preparationTime;
    @FindBy(css = "input#edit-field-number-of-servings-0-value")
    WebElement numberOfServings;
    @FindBy(css = "select#edit-field-difficulty")
    WebElement dificulty;
    @FindBy(css = "input#edit-field-summary-0-value")
    WebElement summary;
    @FindBy(css = "#cke_edit-field-ingredients-0-value")
    WebElement ingredients;
    @FindBy(css = "#cke_edit-field-instruction-0-value")
    WebElement instruction;
    @FindBy(css = "select#edit-moderation-state-0-state")
    WebElement saveAs;
    @FindBy(css = "#edit-submit")
    WebElement saveBtn;

    public RecipePage fillRecipeForm(Recipe recipe) {
        setRecipeTitle(recipe.getTitle());
        setRecipePreparationTime(recipe.getPreparationTime());
        setRecipeNumberOfServings(recipe.getNumberOfServings());
        setRecipeDificulty(recipe.getDificulty());
        setRecipeSummary(recipe.getSummary());
        setRecipeIngredients(recipe.getIngredients());
        setRecipeInstructions(recipe.getInstructions());
        setRecipeSaveAs(recipe.getSaveAs());
        clickSaveBtn();
        return new RecipePage();
    }

    private void setRecipeSaveAs(String saveAs) {
        Select selectElement = new Select(this.saveAs);
        selectElement.selectByValue(saveAs);
    }

    private void setRecipeInstructions(String instructions) {
       this.instruction.sendKeys(instructions);
    }

    private void setRecipeIngredients(String ingredients) {
        this.ingredients.sendKeys(ingredients);
    }

    private void setRecipeSummary(String summary) {
        this.summary.sendKeys(summary);
    }

    private void setRecipeDificulty(String dificulty) {
        Select selectElement = new Select(this.dificulty);
        selectElement.selectByValue(dificulty);
    }

    private void setRecipeNumberOfServings(int numberOfServings) {
        this.numberOfServings.sendKeys(numberOfServings+"");
    }

    private void setRecipePreparationTime(int preparationTime) {
        this.preparationTime.sendKeys(preparationTime+"");
    }

    private void setRecipeTitle(String name) {
        this.title.sendKeys(name);
    }

    private void clickSaveBtn() {
        saveBtn.click();
    }
}
