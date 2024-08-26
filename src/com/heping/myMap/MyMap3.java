package com.heping.myMap;

import java.util.Map;
import java.util.TreeMap;

public class MyMap3 {
    public static void main(String[] args) {
        Map<Student,String> map =new TreeMap<>();
        Student st1 =new Student(42, "周红");
        Student st2 =new Student(36, "黄红");
        Student st3 =new Student(3, "周昭玥");
        Student st4 =new Student(3, "周昭");
        map.put(st1,"邵阳");
        map.put(st2,"长沙");
        map.put(st3,"长沙跳马");
        map.put(st4,"长沙");
        //System.out.println(map);
        map.forEach((Student key,String value)->{
            System.out.println(key+"----------"+value);
        });


    }
}
