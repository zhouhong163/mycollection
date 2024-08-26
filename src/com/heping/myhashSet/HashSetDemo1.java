package com.heping.myhashSet;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student> hs =new HashSet<>();
        Student st1=new Student("周红",40);
        Student st2=new Student("黄红",36);
        Student st3=new Student("周昭玥",3);
        Student st4=new Student("周昭玥1",3);

        hs.add(st1);
        hs.add(st2);
        hs.add(st3);
        hs.add(st4);

        for (Student h : hs) {
            System.out.println(h);
        }
    }
}
