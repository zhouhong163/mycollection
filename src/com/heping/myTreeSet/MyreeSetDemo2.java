package com.heping.myTreeSet;

import java.util.TreeSet;
/*
* TreeSet集合实现自然排序，对象类必须实现Comparable接口 重写里面的方法
*
* */
public class MyreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts =new TreeSet<>();
        Student stu1 =new Student("周红",35);
        Student stu2 =new Student("黄红",30);
        Student stu3 =new Student("用帮",30);
        Student stu4 =new Student("周昭",2);
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        ts.add(stu4);
        System.out.println(ts);
    }
}
