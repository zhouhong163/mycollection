package com.heping.myFile;

import java.io.File;
import java.io.IOException;

public class MyFile2 {
    public static void main(String[] args) throws IOException {
        //在当面模块下的aaa文件夹下创建一个a.txt文件
        File file=new File("mycollection\\aaa");
        if(!file.exists()){
            file.mkdirs();
        }
        File file2 =new File(file,"a.txt");
        boolean newFile = file2.createNewFile();
        System.out.println(newFile);
    }
}
