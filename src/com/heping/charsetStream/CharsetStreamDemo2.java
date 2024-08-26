package com.heping.charsetStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharsetStreamDemo2 {
    //字符流写数据
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("mycollection//aaa//b.txt");//创建字符流对象
        //写数据
       /* fw.write(97);
        fw.write(98);
        fw.write(99);*/
        char[] chs = {100,104,105,106,107};
        fw.write(chs,0,3);
        //关闭资源
        fw.close();

    }
}
