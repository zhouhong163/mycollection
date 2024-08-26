package com.heping.myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap1 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap();
        map.put("周红",40);
        map.put("黄红",36);
        map.put("周昭玥",2);
        System.out.println(map);
        Set<String> key = map.keySet();
        for (String s : key) {
            Integer v = map.get(s);
            System.out.println(s+"------"+v);
            System.out.println("----------------------");
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                String key1 = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key1+"-----------"+value);


            }


        }
        

    }
}
