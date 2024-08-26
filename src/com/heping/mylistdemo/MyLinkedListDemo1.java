package com.heping.mylistdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        //三种遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------");
        //iterator迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        //for增强型
        for (String s : list) {
            System.out.println(s);
        }
        //特殊方法
        list.addFirst("周红");
        System.out.println(list);
        list.addLast("黄红");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println(first+last);
    }
}
