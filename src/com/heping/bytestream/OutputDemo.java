package com.heping.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("mycollection\\aaa\\a.txt"),true);
        /*fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.write(102);*/
        //多次写入
        byte[] arr={97,98,99,100,101,102};
        for (int i = 0; i < arr.length; i++) {
            fos.write(arr[i]);
            fos.write("\r\n".getBytes()); //换行
        }
        fos.write(arr,1,3);
        fos.close();
    }
}
