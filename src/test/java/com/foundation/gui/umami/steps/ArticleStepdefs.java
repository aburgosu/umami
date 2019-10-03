package com.foundation.gui.umami.steps;

import com.foundation.gui.umami.entities.Article;
import com.foundation.gui.umami.entities.Context;
import com.foundation.gui.umami.ui.pages.ArticlePage;
import com.foundation.gui.umami.ui.pages.CreateArticlePage;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class ArticleStepdefs {

    private Context context;
    private CreateArticlePage createArticlePage;
    private ArticlePage articlePage;

    /**
     * Initializes the class setting the context.
     *
     * @param context - Context to be set.
     */
    public ArticleStepdefs(final Context context) {
        this.context = context;
    }

    /**
     * Adds a new Article with the map data.
     *
     * @param inputFields - Data to fill the add address form.
     */
    @When("I fill the Article form with the following data")
    public void fillArticleForm(final Map<String, String> inputFields) {
        createArticlePage = new CreateArticlePage();
        context.getArticle().setData(inputFields);
        createArticlePage.fillForm(context.getArticle());
    }

    /**
     * Verifies if address appears on address book entries table.
     */
    @When("the confirmation message is displayed")
    public void verifyIfAddressIsOnAddressBook() {
        articlePage = new ArticlePage();
        Assert.assertTrue(articlePage.getConfirmation(context.getArticle()));
    }


}
