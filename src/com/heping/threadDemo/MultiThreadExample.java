package com.heping.threadDemo;

public class MultiThreadExample {
    public static void main(String[] args) {
   // int count=100;
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread 1 is running. ID: " + Thread.currentThread().getId());
        }
    });

    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread 2 is running. ID: " + Thread.currentThread().getId());
        }
    });

    thread1.start();
    thread2.start();
}
}
