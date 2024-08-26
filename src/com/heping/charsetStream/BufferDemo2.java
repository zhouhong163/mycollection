package com.heping.charsetStream;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class BufferDemo2 {
    public static void main(String[] args) throws IOException {
        //读取文件中的数据排序后再次写到本地 一行行读好些 字符缓冲流的独有方法
        BufferedReader br =new BufferedReader(new FileReader("mycollection\\aaa\\c.txt"));
        String s = br.readLine();
       // String[] line = s.split(" ");
       // System.out.println(Arrays.toString(line));
        System.out.println("读到的数据："+s);
        br.close();
        //进行切割
        String[] line = s.split(" ");
        //把字符串字符串变成int类型数组
        int [] arr =new int[line.length];
        for (int i = 0; i < line.length; i++) {
            int number= Integer.parseInt(line[i]);
            arr[i]=number;
        }
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //写到本地
        BufferedWriter bw =new BufferedWriter(new FileWriter("mycollection\\aaa\\d.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
            bw.flush();
        }

        bw.close();
    }
}
