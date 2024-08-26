package com.heping.myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MyreeSetDemo4 {
    public static void main(String[] args) {
        //添加的字符串按照字符长短排序  不能用自然排序 因为字符串实现comparable类对象  是按照字典排序
        /*TreeSet<String> ts =new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = o1.length() - o2.length();
                return res;
            }




        });*/
        //lambda表达式
        TreeSet<String> ts =new TreeSet<>((String o1, String o2)->{
            int res = o1.length() - o2.length();
            return res;
        });
        ts.add("ab");
        ts.add("abdf");
        ts.add("bbcccd");


        System.out.println(ts);
    }
}
