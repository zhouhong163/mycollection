package com.heping.mylistdemo;

import java.util.ArrayList;

public class GeneMethod1 {
    public static void main(String[] args) {
        //泛型方法，传递一个集合和四个元素，将元素添加到集合并返回  泛型方法 只有调用的时候才给方法返回值类型
       ArrayList<String> list1= addElenments(new ArrayList<>(),"a","b","c","d");
        System.out.println(list1);


    }
    public static <T>ArrayList<T> addElenments(ArrayList<T> list,T t1,T t2,T t3,T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
