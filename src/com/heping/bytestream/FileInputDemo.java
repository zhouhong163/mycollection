package com.heping.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("mycollection\\aaa\\a.txt");
        int b ;
        while((b= fis.read())!=-1){
            System.out.println((char)b);
        }
        fis.close();
    }
}
