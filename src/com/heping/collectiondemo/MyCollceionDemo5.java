package com.heping.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollceionDemo5 {
    public static void main(String[] args) {
        Collection<Student> list =new ArrayList<>();
        Student st1 =new Student("周鸿",23);
        Student st2 =new Student("黄红",30);
        list.add(st1);
        list.add(st2);
        //增强for
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("---------");
        //iterator型
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student next = it.next();
            System.out.println(next);
        }



    }
}
