package com.heping.convertStream;

import java.io.*;
import java.util.ArrayList;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //用对象操作流读写多个对象
        Student st1 =new Student("周红",41);
        Student st2 =new Student("黄红",36);
        Student st3 =new Student("周昭玥",2);
        //对象操作输出流也就是序列化
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("mycollection\\aaa\\stuinfo.txt"));
        ArrayList<Student> list =new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        oos.writeObject(list);
        oos.close();
        
        //对象操作输入流也就是反序列化    
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("mycollection\\aaa\\stuinfo.txt"));
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }

        ois.close();

    }
}
