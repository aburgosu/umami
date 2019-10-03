package com.foundation.gui.core.selenium;

import com.foundation.gui.core.selenium.webdrivers.Chrome;
import com.foundation.gui.core.selenium.webdrivers.Firefox;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static final String BROWSER_DOES_NOT_EXIST = "The Browser does not exist";
    private static WebDriver webDriver;

    public static WebDriver getWebDriver(String browser) {

        switch (browser) {
            case "chrome":
                webDriver = new Chrome().initDriver();
                break;
            case "firefox":
                webDriver = new Firefox().initDriver();
                break;
            default:
                throw new RuntimeException(BROWSER_DOES_NOT_EXIST);
        }
        return webDriver;
    }
}
