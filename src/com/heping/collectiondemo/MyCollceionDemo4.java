package com.heping.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollceionDemo4 {
    public static void main(String[] args) {
      /* *//* Collection<String> collection =new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        //Iterator<String> it = collection.iterator();
        for(String s : collection){
            System.out.println(s);*//*
        }*/
        //只有数组与单列集合list(Arraylist,Linkerlist可以用增强for与iterator)
        int[] arr ={1,2,3,4};
        for(int a : arr){
            System.out.println(a);
        }

    }
}
