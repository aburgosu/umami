package com.foundation.gui.umami.ui.pages;

import com.foundation.gui.core.selenium.WebDriverManager;
import com.foundation.gui.umami.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to navigate the website.
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public class PageTransporter {
    private static WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();;
    private static final Map<String, String> pages = new HashMap<>();
    private static final Map<String, String> languages = new HashMap<>();

    /**
     * The map contains the corresponding page URL.
     */
    static {
        pages.put("login", "/user/login");
        pages.put("profile", "/user");
        pages.put("createArticle", "/node/add/article");
    }

    /**
     * The map contains the languages.
     */
    static {
        languages.put("english", "en");
        languages.put("spanish", "es");
    }

    /**
     * Get URL with the language and corresponding page.
     *
     * @param pageName - Page name from which it is required the suffix.
     * @param language - the language selected.
     * @return - URL with base, language and page build.
     */
    public static String getURL(final String pageName, final String language) {
        return ReadAppProperties.getInstance().getProperty("base_url")+ languages.get(language) + pages.get(pageName);
    }
    /**
     * This method is used for go to a page given as page parameter.
     *
     * @param page The parameter page defines a input page.
     */
    public static void goToUrl(final String page) {
        String language = ReadAppProperties.getInstance().getProperty("language");
        String url = getURL(page,language);
        webDriver.navigate().to(url);
        webDriver.get(url);
    }


}
