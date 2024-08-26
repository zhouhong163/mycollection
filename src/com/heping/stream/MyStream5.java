package com.heping.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream5 {
    public static void main(String[] args) {
        //stream流收集方法  单列集合
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
        Stream<Integer> limit = list.stream().limit(5);
        /*System.out.println(limit.collect(Collectors.toList()));*/
        Set<Integer> set = limit.collect(Collectors.toSet());
        System.out.println(set);


    }
}
