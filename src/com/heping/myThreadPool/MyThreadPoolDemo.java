package com.heping.myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建线程池 返回的是线程池控制对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });
        Thread.sleep(1000);//那是因为执行了一个线程  已经还给了线程池，所以继续执行池子里面的线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });

        executorService.shutdown();

    }
}
