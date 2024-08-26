package com.heping.threadBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        //创建一个阻塞对象，容量为1
        ArrayBlockingQueue<String> list =new ArrayBlockingQueue<>(1);
        //创建线程
        Cooker c =new Cooker(list);
        Foodie f =new Foodie(list);
        c.start();
        f.start();

    }
}
