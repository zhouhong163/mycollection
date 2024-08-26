package com.heping.myTreeSet;

import java.util.TreeSet;

public class MyreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet<StudentScore> ts =new TreeSet<>();
        StudentScore s1 =new StudentScore("周红",80,80,80);
        StudentScore s2 =new StudentScore("黄红",90,90,90);
        StudentScore s4 =new StudentScore("yongban",91,89,90);
        StudentScore s3 =new StudentScore("周昭玥",100,100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
