package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// This class is only 1 time we are creating in utilities package
public class ConfigurationReader {

    // create the object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("key")
    // it is static because we using it in static method
    // it is private because I will be using only in this class

    private static Properties properties = new Properties();

    // we want to open the properties file and load to properties object ONLY ONCE before reading
    // having static block because static runs first

    static {

        try {
            // create the object of FileInputStream
            // we need this object to open file as a stream in Java memory

            FileInputStream file = new FileInputStream("config.properties");

            // load the properties object using FileInputStream object
            // load "properties" object with the "file" we opened using FileInputStream

            properties.load(file);

            // close the file after loading
            // if we do not close the file, it will take space from computer memory like Scanner
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in properties file
     * @return -> value for the key, returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env"))
     */

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
