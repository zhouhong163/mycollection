package com.heping.threadConProduceMode;

public class Consumer extends Thread{
    @Override
    public void run() {
       while(true){
           synchronized(Desk.lock){
              if(Desk.count==0){
                  break;
              }else{
                  if(Desk.flag){
                      //吃
                      Desk.count--;
                      System.out.println(Thread.currentThread().getName()+"吃了一个包子，还剩下"+Desk.count+"个");
                      Desk.flag=false;
                      Desk.lock.notifyAll();
                  }else{
                      //等待
                      try {
                          Desk.lock.wait();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }
              }
           }
       }

    }
}
