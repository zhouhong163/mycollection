package com.heping.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties prop= new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("湖北","武汉");
        prop.setProperty("湖南","长沙");
        prop.setProperty("河北","长沙");

        String val = prop.getProperty("湖南");
        System.out.println(val);

        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(prop.getProperty(s));
        }
    }
}
