package com.heping.threadDemo;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicket implements Runnable{
    private int ticket = 500;
    private ReentrantLock lock =new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            if(ticket==0){
                break;
            }else{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                System.out.println(Thread.currentThread().getName()+"在卖票，还剩下"+ticket+"张票");

            }
            lock.unlock();
        }
    }
}
