package com.heping.convertStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象反序列化流   也就是对象操作输入流
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("mycollection\\aaa\\user.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();

    }
}
