package com.heping.threadDemo;

public class Ticket2Test {
    public static void main(String[] args) {
        Ticket2 t1 =new Ticket2();
        Ticket2 t2 =new Ticket2();
        t1.setName("窗口x");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
