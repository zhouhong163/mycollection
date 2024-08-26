package com.heping.myThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor pool =new ThreadPoolExecutor(
                2,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 16; i++) {
            int y =i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"在执行"+y);
            });
        }


        pool.shutdown();
    }
}
