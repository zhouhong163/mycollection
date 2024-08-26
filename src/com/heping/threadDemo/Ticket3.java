package com.heping.threadDemo;

public class Ticket3 implements Runnable{
    private static int ticket = 1000;
    @Override
    public void run() {
       while (true){
           if("窗口1".equals(Thread.currentThread().getName())){
               //同步方法
               boolean result= synchronizedMethod();
               if(result){
                   break;
               }

           }
           //同步代码块
           if("窗口2".equals(Thread.currentThread().getName())){
               synchronized (this){
                   if(ticket==0){
                       break;
                   }else{
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

    private synchronized boolean synchronizedMethod() {
        if(ticket==0){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张票");
            return false;
        }
    }
}


