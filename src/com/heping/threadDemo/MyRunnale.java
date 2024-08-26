package com.heping.threadDemo;

public class MyRunnale implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"第二种方式实现多线程并开启了"+i);
        }
    }
}
