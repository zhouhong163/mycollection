package com.heping.stream;

import java.util.LinkedList;
import java.util.List;

public class MyStream4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList(List.of(1,2,3,4,5,6,7,8,9,10));
        list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));

    }
}
