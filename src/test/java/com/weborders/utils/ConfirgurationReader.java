package com.weborders.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfirgurationReader {
    private static Properties properties = new Properties();

    static {
        // try w resources
        // allows to automaticall close input stream when object is not used anymore
        try(InputStream in = new FileInputStream("configuration.properties")){
            properties.load(in);

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration.properties file!");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
