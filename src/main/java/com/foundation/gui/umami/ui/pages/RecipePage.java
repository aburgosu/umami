package com.foundation.gui.umami.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecipePage extends BasePage {
    @FindBy(css = "h1.page-title")
    WebElement title;
    @FindBy(css = "div.label-items.field--name-field-difficulty")
    WebElement difficulty;

    public String getRecipeTitle() {
        return title.getText();
    }

    public String getDifficulty() {
        return difficulty.getText().substring(11);
    }
}
