package com.heping.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\Desktop\\周红_证件照.jpg");
        FileOutputStream fos =new FileOutputStream("mycollection\\aaa\\周红_证件照.1.jpg");
        byte [] bytes =new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
