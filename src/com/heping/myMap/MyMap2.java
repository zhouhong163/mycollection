package com.heping.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap2 {
    public static void main(String[] args) {
        Map<Student,String> map =new HashMap<>();
        Student st1 =new Student(41, "周红");
        Student st2 =new Student(36, "黄红");
        Student st3 =new Student(3, "周昭玥");
        map.put(st1,"汉族");
        map.put(st2,"汉族");
        map.put(st3,"汉族");
        System.out.println("===========第一种遍历==========");
       Set<Student> students = map.keySet();
        for(Student s:students){
            System.out.println(s+"-----"+map.get(s));


    }
        System.out.println("===========第二种遍历==========");
        Set<Map.Entry<Student,String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-------"+value);

        }
        System.out.println("===========第三种遍历==========");
        map.forEach((Student key,String value)->{
            System.out.println(key+"-------"+value);
        });


    }
}
