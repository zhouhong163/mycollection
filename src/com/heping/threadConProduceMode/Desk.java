package com.heping.threadConProduceMode;

public class Desk {
    //定义一个标记 ，表示桌子上的汉堡包有无
    public static boolean flag =false;
    //定义汉堡包数量
    static int count =10;
    //定义唯一的锁对象 不能更改他的地址值
    public  static final Object lock =new Object();
}
