package com.heping.mylistdemo;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo1 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(0,"周红");
        list.set(1,"cdf");
        System.out.println(list);
        boolean ddd = list.remove("ddd");
        System.out.println(list);
        System.out.println(list.get(1));


    }
}
