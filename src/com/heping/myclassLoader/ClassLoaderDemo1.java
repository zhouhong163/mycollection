package com.heping.myclassLoader;

public class ClassLoaderDemo1 {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader platformClassLoader = systemClassLoader.getParent();
        ClassLoader bootstrapClassLoader = platformClassLoader.getParent();
        System.out.println(systemClassLoader);
        System.out.println(platformClassLoader);
        System.out.println(bootstrapClassLoader);


    }
}
