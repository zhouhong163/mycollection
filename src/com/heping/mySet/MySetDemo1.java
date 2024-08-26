package com.heping.mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//可重复集合set  存取顺序不一致 不能用索引 所以不能用for循环
public class MySetDemo1 {
    public static void main(String[] args) {
        Set<String> set =new TreeSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hello");
        System.out.println(set);
        /*for (String s : set) {
            System.out.println(s);
        }*/
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
