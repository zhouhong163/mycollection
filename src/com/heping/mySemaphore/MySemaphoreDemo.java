package com.heping.mySemaphore;

import java.util.concurrent.Semaphore;

public class MySemaphoreDemo implements Runnable{
    //1 创建管理员对象
    Semaphore semaphore =new Semaphore(2);


    @Override
    public void run() {

        try {
            //2.获取通行证通行
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"获得通行证并开始通行");
            //3.通行
           // System.out.println(Thread.currentThread().getName()+"开始通行");

            Thread.sleep(2000);//等待2秒
            System.out.println(Thread.currentThread().getName()+"归还同行证");
            //4.归还
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
