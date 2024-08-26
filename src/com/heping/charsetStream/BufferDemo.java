package com.heping.charsetStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        //字符缓冲流
        BufferedReader br =new BufferedReader(new FileReader("mycollection//aaa//userpass.txt"));
        int len;
        char [] ch =new char[1024];
        while((len=br.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        br.close();
    }
}
