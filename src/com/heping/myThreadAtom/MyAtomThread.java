package com.heping.myThreadAtom;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomThread implements Runnable{
    //private volatile int count=0;
    //private Object lock=new Object();
    AtomicInteger ac =new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int count = ac.incrementAndGet();
            //count++;
                System.out.println(Thread.currentThread().getName()+"已经送了"+count+"个汉堡包");

        }
    }
}
