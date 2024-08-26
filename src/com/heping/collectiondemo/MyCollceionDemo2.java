package com.heping.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollceionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("b".equals(s)){
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);
    }
}
