package com.heping.threadBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private ArrayBlockingQueue<String> list;
    public Foodie(ArrayBlockingQueue<String> list) {
        this.list=list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = list.take();
                System.out.println("吃货吃了一个"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
