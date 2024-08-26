package com.heping.myvariableparameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyCollectionNonChange {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("1","a","b","d"));
        System.out.println(list);
        Set<String> set = Set.of("a","b","c");
        System.out.println(set);
    }
}
