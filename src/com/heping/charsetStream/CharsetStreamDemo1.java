package com.heping.charsetStream;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class CharsetStreamDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码与解码
        String s ="你好，周红 abc";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = s.getBytes("utf-16");
        System.out.println(Arrays.toString(bytes1));
        byte [] byte3={-28, -67, -96, -27, -91, -67, -17, -68, -116, -27, -111, -88, -25, -70, -94, 32, 97, 98, 99};
        String str =new String(byte3);
        System.out.println(str);




    }
}
