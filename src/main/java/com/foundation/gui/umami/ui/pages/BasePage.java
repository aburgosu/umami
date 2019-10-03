package com.foundation.gui.umami.ui.pages;

import com.foundation.gui.umami.common.ReadAppProperties;
import com.foundation.gui.core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used as Page base.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public abstract class BasePage {
    protected WebDriver webDriver;
    private String baseUrl = ReadAppProperties.getInstance().getBaseLogin();
    private Map<String,String> pages = new HashMap<>();

    /**
     * This method is used to initialize a page.
     */
    public BasePage() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
        fillPagesMap();
    }

    protected void fillPagesMap() {
        pages.put("login","");
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    protected String getBaseUrl() {
        return baseUrl;
    }
}
