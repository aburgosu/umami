package com.foundation.gui.umami.steps;

import com.foundation.gui.umami.ui.pages.LoginPage;
import com.foundation.gui.umami.ui.pages.PageTransporter;
import com.foundation.gui.umami.ui.pages.ProfilePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class LoginStepdefs {
    private LoginPage loginPage;
    private ProfilePage profile;

    /**
     * Navigates to given page.
     *
     * @param page - Page name to redirect.
     */
    @Given("I go to (.*) page")
    public void goToPage(final String page) {
        PageTransporter.goToUrl(page);
    }

    @When("I fill the login form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillTheFormWithAnd(final String email, final String password) {
        loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @Then("Username should appear in the (.*) page")
    public void usernameShouldAppearInTheProfile(final String page) {
        profile = new ProfilePage();
        Assert.assertEquals(profile.getConnectedUser(), "admin");
    }

    @When("I login as administrator")
    public void iLoginAsAdministrator() {
        loginPage.login("admin", "password");
    }

    @Given("I login page as administrator")
    public void iLoginPageAsAdministrator() {
        goToPage("login");
        loginPage = new LoginPage();
        loginPage.login("adminuser", "adminpassword");
    }
}
