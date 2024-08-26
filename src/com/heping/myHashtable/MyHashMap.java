package com.heping.myHashtable;

import com.heping.threadDemo.MyThread;

import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer,String> hm =new HashMap<>();
        Thread t1 =new Thread(()->{
            for (int i = 0; i < 25; i++) {
                hm.put(i,i+"");
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 25; i < 51; i++) {
                hm.put(i,i+"");
            }
        });
        t1.start();
        t2.start();

        System.out.println("-----------");
        Thread.sleep(1000);
        Set<Integer> key = hm.keySet();
        for (Integer i : key) {
            String value = hm.get(i);
            System.out.println(value);
        }

    }
}
