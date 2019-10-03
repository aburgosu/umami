package com.foundation.gui.umami.ui.pages;

import com.foundation.gui.umami.entities.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateArticlePage extends BasePage {
    @FindBy(css = "#edit-title-0-value")
    private WebElement articleTitle;

    @FindBy(className = "cke_wysiwyg_frame cke_reset")
    private WebElement articleBody;

    @FindBy(css = "#edit-field-tags-target-id")
    private WebElement articleTags;

    @FindBy(css = "#edit-moderation-state-0-value")
    private WebElement articleState;

    @FindBy(css = "input#edit-submit")
    private WebElement saveButton;

    /**
     * Fill the textbox with the stringKeys data.
     *
     * @param textBox    - TextBox to enter the keys.
     * @param stringKeys - Keys to be entered.
     */
    public static void enterKeys(final WebElement textBox, final String stringKeys) {
        textBox.clear();
        textBox.sendKeys(stringKeys);
    }

    /**
     * Fills form with data given by .
     *
     * @param article - Address from which the data will be retrieved to fill the form.
     */
    public void fillForm(final Article article) {
        enterKeys(articleTitle, article.getTitle());
        enterKeys(articleTags, article.getTags());
        enterKeys(articleState, article.getState());
        saveButton.click();
    }
}
