package com.heping.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStream6 {
    //双列集合的收集
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("周红，41");
        list.add("周昭玥，2");
        list.add("黄红，36");
        list.add("用班，38");
        Map<String, Integer> map = list.stream().filter(
                s -> {
                    String[] split = s.split("，");
                    String s1 = split[1];
                    Integer age = Integer.parseInt(s1);
                    return age >= 36;

                }).collect(Collectors.toMap(
                s -> {
                    return s.split("，")[0];
                }, s -> {
                    return Integer.parseInt(s.split("，")[1]);
                }
        ));
        System.out.println(map);
    }
}
