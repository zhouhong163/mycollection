package com.heping.threadDemo;

public class Ticket implements Runnable{
    private static int ticketCount=100;
    private static Object obj =new Object();
    @Override
    public void run() {
       //买票
       while(true){
           synchronized(obj){
               if(ticketCount<=0){
                   break;
               }else{

                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   ticketCount--;
                   System.out.println(Thread.currentThread().getName()+"正在卖票，还剩"+ticketCount+"张票");
               }
           }
       }

           }
           }


