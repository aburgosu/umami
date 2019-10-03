package com.foundation.gui.umami.ui.pages;


import com.foundation.gui.umami.common.ReadAppProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(css = "#edit-name")
    private WebElement userField;

    @FindBy(css = "#edit-pass")
    private WebElement passwordField;

    @FindBy(css= "#user-login-form #edit-submit")
    private WebElement submitLoginButton;

    public void login(String user, String password) {
        userField.sendKeys(ReadAppProperties.getInstance().getProperty(user));
        passwordField.sendKeys(ReadAppProperties.getInstance().getProperty(password));
        submitLoginButton.click();
    }
}
