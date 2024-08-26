package com.heping.myTreeSet;

import java.util.TreeSet;

/*
* 存储Integer类型的TreeSet类
*
* */
public class MyTreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);

    }
}
