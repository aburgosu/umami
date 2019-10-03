package com.foundation.gui.umami.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the email to Page.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public class ProfilePage extends BasePage {
    @FindBy(css = "h1.js-quickedit-page-title.page-title")
    private WebElement user;

    /**
     * This method get the username of logged in user.
     *
     * @return a String with title the user.
     */
    public String getConnectedUser() {
        return user.getText();
    }
}
