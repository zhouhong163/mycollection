package com.heping.myCountdownLatch;

import java.util.concurrent.CountDownLatch;

public class ChildThread3 extends Thread{
    private CountDownLatch countDownLatch;
    public ChildThread3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //吃饺子
        for (int i = 1; i <=20; i++) {
            System.out.println(Thread.currentThread().getName()+"在吃第"+i+"个饺子");
        }
        //吃完说一声
        countDownLatch.countDown();
    }
}
