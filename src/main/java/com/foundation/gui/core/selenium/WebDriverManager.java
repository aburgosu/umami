package com.foundation.gui.core.selenium;

import java.util.concurrent.TimeUnit;

import com.foundation.gui.core.selenium.webdrivers.Chrome;
import org.openqa.selenium.WebDriver;

public class WebDriverManager {

    private static WebDriverManager instance = null;
    private WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private WebDriver webDriver;


    private WebDriverManager() {
        initialize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize() {
        webDriver = getWebDriver(webDriverConfig.getBrowser());
        webDriver.manage()
                .timeouts()
                .implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    private WebDriver getWebDriver(String browser) {
        webDriver = WebDriverFactory.getWebDriver(WebDriverConfig.getInstance().getBrowser());
        return webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
