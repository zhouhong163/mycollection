package com.heping.myThreadAtom;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicIntegerDemo {
    public static void main(String[] args) {
        AtomicInteger ac =new AtomicInteger(10);
        System.out.println(ac.get());
        System.out.println("---------------------");
        int andIncrement = ac.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(ac.get());
        System.out.println("---------------------");
        int incrementAndGet = ac.incrementAndGet();
        System.out.println(incrementAndGet);
        System.out.println("---------------------");
        int add = ac.addAndGet(20);
        System.out.println(add);
        System.out.println(ac.get());
        System.out.println("---------------------");
        int res = ac.getAndAdd(30);
        System.out.println(res);
        System.out.println(ac.get());


    }
}
