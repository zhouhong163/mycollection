package com.heping.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\Desktop\\周红_证件照.jpg");
        FileOutputStream fos =new FileOutputStream("mycollection\\aaa\\周红_证件照.jpg");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();

    }
}
