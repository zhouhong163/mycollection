package com.heping.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollceionDemo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");
        collection.add("g");
        //boolean res = collection.remove("c");
        boolean isContains = collection.contains("c");
        System.out.println(isContains);
        //collection.clear();
        int size = collection.size();
        System.out.println(size);
        collection.removeIf((String s)->{
           return s.length()==2;
        });
        System.out.println(collection);
        //iterator迭代器对象以及两个方法hasNext表示当前位置是否有元素可以被去除  next表示取出当前元素并往后移动一位下标
        Iterator<String> it = collection.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}
