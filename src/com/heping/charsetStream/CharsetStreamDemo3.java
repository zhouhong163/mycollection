package com.heping.charsetStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CharsetStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字符输入流
        FileReader fr =new FileReader(new File("mycollection//aaa//a.txt"));
        char [] chs =new char[1024];
        int read;
        while((read =fr.read(chs))!= -1){
            System.out.println(new String(chs,0,read));

        }
        fr.close();
    }
}
