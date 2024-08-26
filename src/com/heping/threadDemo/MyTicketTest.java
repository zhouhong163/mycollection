package com.heping.threadDemo;

public class MyTicketTest {
    public static void main(String[] args) {
        MyTicket mt=new MyTicket();
        Thread t1 =new Thread(mt,"窗口1");
        Thread t2 =new Thread(mt,"窗口2");
        t1.start();
        t2.start();
        t2.setPriority(1);
        t1.setPriority(10);
    }
}
