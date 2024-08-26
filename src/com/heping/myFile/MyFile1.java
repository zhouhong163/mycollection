package com.heping.myFile;

import java.io.File;
import java.io.IOException;

public class MyFile1 {
    public static void main(String[] args) throws IOException {
        /*File file =new File("E:\\和平小学\\aaaa\\bbb\\ccc");
        boolean mkdirs = file.mkdirs();
        //boolean delete = file.delete();
        //System.out.println(delete);
        boolean res1 = file.isDirectory();
        boolean res2 = file.isFile();
        System.out.println(res1);
        System.out.println(res2);
        boolean res3 = file.exists();
        System.out.println(res3);
        String name = file.getName();
        System.out.println(name);*/
        File file =new File("E:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
       /* for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }*/



        //boolean newFile = file.createNewFile();
        //System.out.println(newFile);
    }
}
