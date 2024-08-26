package com.heping.bytestream;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\周红_证件照_白.jpg"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("mycollection\\aaa\\周红_证件照_白.jpg"));
        int b;

        while((b=bis.read())!=-1){
            bos.write(b);
        }

        bis.close();
        bos.close();



    }
}
