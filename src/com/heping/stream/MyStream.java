package com.heping.stream;

import java.util.ArrayList;
import java.util.List;

public class MyStream {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("张三峰","张霞","张睡","周红","张莉莉"));
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.println(s);
        }
        //stram流
        System.out.println("===============");
        list1.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.println(s));

    }
}
