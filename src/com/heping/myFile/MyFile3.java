package com.heping.myFile;

import java.io.File;

public class MyFile3 {
    public static void main(String[] args) {
        //输出一个多级文件夹
        File file =new File("C:\\Users\\Administrator\\Desktop\\aa");
        delFile(file);
    }

    private static void delFile(File file) {
        //先进入
        File[] files = file.listFiles();
        //遍历
        for (File file1 : files) {
            //判断 是否是文件夹
            if(file1.isDirectory()){
                //递归
                delFile(file1);
            }

            //判断是否是文件
            if(file1.isFile()){
                file1.delete();
            }
        }
        file.delete();

    }
}
