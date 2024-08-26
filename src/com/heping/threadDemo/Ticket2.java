package com.heping.threadDemo;

public class Ticket2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                } else {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张票");
                }
            }
        }
    }
}
