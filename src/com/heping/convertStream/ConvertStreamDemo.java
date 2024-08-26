package com.heping.convertStream;

import java.io.FileReader;
import java.io.IOException;

public class ConvertStreamDemo {
    public static void main(String[] args) throws IOException {
        //转化流
        FileReader fr =new FileReader("mycollection\\aaa\\b.txt");
        int read;
        while((read=fr.read())!=-1){
            System.out.println((char)read);
        }

        fr.close();

    }
}
