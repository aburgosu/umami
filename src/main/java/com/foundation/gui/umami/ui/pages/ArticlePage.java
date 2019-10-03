package com.foundation.gui.umami.ui.pages;

import com.foundation.gui.umami.entities.Article;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage{

    @FindBy(className = "page-title")
    private WebElement articleTitle;

    public boolean getConfirmation(Article article) {

        return articleTitle.getText().equals(article.getTitle());
    }
}
