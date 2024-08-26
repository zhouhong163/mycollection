package com.heping.myCountdownLatch;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CountDownLatch;

public class MotherTread extends Thread{
    private CountDownLatch countDownLatch;
    public MotherTread(CountDownLatch countDownLatch) {
           this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //等待
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //收拾碗筷
        System.out.println(getName()+"开始收拾碗筷");
    }
}
