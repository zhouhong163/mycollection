package com.heping.convertStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        User user =new User("周红","zh19831111");
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("mycollection\\aaa\\user.txt"));
        oos.writeObject(user);

        oos.close();
    }
}
