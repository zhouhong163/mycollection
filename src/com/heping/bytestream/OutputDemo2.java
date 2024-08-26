package com.heping.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo2 {
    public static void main(String[] args) {
        //标准写发 try...catch...finally
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("mycollection\\aaa\\a.txt");
            byte [] arr={97,98,99,100,101};
            fos.write(arr);

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
