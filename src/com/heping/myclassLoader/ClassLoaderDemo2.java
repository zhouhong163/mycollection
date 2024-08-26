package com.heping.myclassLoader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ClassLoaderDemo2 {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        //字节流转化为字符流
        InputStreamReader isr =new InputStreamReader(is,"UTF-8");
        Properties prop =new Properties();
        prop.load(isr);
        System.out.println(prop);
        is.close();

    }
}
