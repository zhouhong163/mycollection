package com.heping.myCountdownLatch;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        //创建CountdownLatch对象并传递给四个线程
        CountDownLatch countDownLatch = new CountDownLatch(3);
        //创建4个线程
        MotherTread mt =new MotherTread(countDownLatch);
        ChildThread1 t1 =new ChildThread1(countDownLatch);
        ChildThread2 t2 =new ChildThread2(countDownLatch);
        ChildThread3 t3 =new ChildThread3(countDownLatch);

        mt.setName("妈妈");
        mt.start();

        t1.setName("儿子1");
        t1.start();

        t2.setName("儿子2");
        t2.start();

        t3.setName("儿子3");
        t3.start();

    }
}
