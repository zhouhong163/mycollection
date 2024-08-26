package com.heping.threadDemo;

public class Ticket3Test {
    public static void main(String[] args) {

        Ticket3 ticket3 = new Ticket3();
        Thread t1 =new Thread(ticket3);
        Thread t2 =new Thread(ticket3);
        t1.setName("窗口1");
        t1.setName("窗口2");
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
