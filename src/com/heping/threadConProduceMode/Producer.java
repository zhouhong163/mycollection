package com.heping.threadConProduceMode;

public class Producer extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(!Desk.flag){
                        //生产
                        System.out.println(Thread.currentThread().getName()+"生产了一个汉堡，还剩下"+Desk.count+"个汉堡");
                        Desk.flag=true;
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
