package com.heping.threadDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc =new MyCallable();
        FutureTask<String> ft =new FutureTask<>(mc);
        Thread t1=new Thread(ft);
        t1.start();
        String s = ft.get();
        System.out.println(s);
    }
}
