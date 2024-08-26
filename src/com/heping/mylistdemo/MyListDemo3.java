package com.heping.mylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("周红");
        list.add("黄红");
        list.add("周昭玥");
        System.out.println(list);
      /*  Object[] objects = list.toArray();
        String s = Arrays.toString(objects);
        System.out.println(s);*/
        String[] s = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(s));


    }
}
