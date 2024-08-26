package com.heping.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyStream3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(1,2,5,9));
        //截取前面两个
        //list.stream().limit(2).forEach(s->System.out.println(s));
        //跳过前面2个
       // list.stream().skip(2).forEach(s->System.out.println(s));
        //合并两个stream流
        /*Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = list2.stream();
        Stream<Integer> concat = Stream.concat(s1, s2);
        concat.forEach(s-> System.out.print(s + " "));*/
        //去除重复
        /*list.stream().distinct().forEach(s-> System.out.println(s));*/

        long count = list.stream().count();
        System.out.println(count);



    }
}
