package com.heping.threadDemo;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();
        t1.sleep(1000);
        t1.start();
        //t2.start();
    }
}
