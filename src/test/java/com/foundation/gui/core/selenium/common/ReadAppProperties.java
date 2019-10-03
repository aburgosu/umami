package com.foundation.gui.core.selenium.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class implements the read .
 *
 * @author Andres Burgos.
 * @version 1.0
 */
public final class ReadAppProperties {
    private static final String PROPERTIES_FILE = "umami.properties";
    private static ReadAppProperties readAppProperties;
    private Properties properties;
    private FileInputStream inputStream;

    /**
     * this method is used for initializes the variables.
     */
    private ReadAppProperties() {
        properties = readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigurationFile() {
        try {
            inputStream = new FileInputStream(PROPERTIES_FILE);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * This method ensure that only one instance is created according to the build pattern.
     *
     * @return an instance of 'ReadAppProperties' type.
     */
    public static ReadAppProperties getInstance() {
        if (readAppProperties == null) {
            readAppProperties = new ReadAppProperties();
        }
        return readAppProperties;
    }

    /**
     * This method is used for get the url of login in page.
     *
     * @return a string with the email.
     */
    public String getBaseLogin() {
        return properties.getProperty("base_url");
    }

    /**
     * This method is used for get the email of the user.
     *
     * @param property The parameter properties defines a input string for chose on properties file.
     * @return a string with the email.
     */
    public String getProperty(final String property) {
        return properties.getProperty(property);
    }
}
