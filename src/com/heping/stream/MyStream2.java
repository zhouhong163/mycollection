package com.heping.stream;

import java.util.*;
import java.util.stream.Stream;

public class MyStream2 {
    public static void main(String[] args) {
        //单列集合stream流
        //method1();
        //双列集合keySet以及entrySet的stream流
        //method2();
        //method3();数组的stream流
        //同种数据类型的多个数据
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(s-> System.out.print(s +" "));
    }

    private static void method3() {
        int[] arr={1,2,3,4,5};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }

    private static void method2() {
        HashMap<String, Integer> hm = new HashMap<>(Map.of("a", 1, "b", 2, "c", 3));
        hm.keySet().stream().forEach(s-> System.out.println(s));
        //双列集合entrySet
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.stream().forEach(s-> System.out.println(s));
    }

    private static void method1() {
        ArrayList<String>list=new ArrayList<>(List.of("周红","黄红","周昭玥"));
        list.stream().forEach(s-> System.out.println(s));
    }
}
