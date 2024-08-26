package com.heping.mySemaphore;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        MySemaphoreDemo ms =new MySemaphoreDemo();
        for (int i = 0; i < 100; i++) {
            new Thread(ms).start();
        }
    }
}
