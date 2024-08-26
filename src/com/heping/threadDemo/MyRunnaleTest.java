package com.heping.threadDemo;

public class MyRunnaleTest {
    public static void main(String[] args) {
        MyRunnale mr =new MyRunnale();
        Thread t1 =new Thread(mr); //作为线程类Thread的空参构造
        t1.start();

    }
}
