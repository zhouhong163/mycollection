package com.heping.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyScoketReceiveDemo1 {
    public static void main(String[] args) throws IOException {
        //创建箱子 创建DatagramSocket对象 绑定发送端10000端口
        DatagramSocket ds =new DatagramSocket(2000);
        //创建一个空箱子，里面接收
        byte[] bytes = new byte[1024];
        DatagramPacket dp =new DatagramPacket(bytes,bytes.length);
        //箱子接收数据
        ds.receive(dp);
        //从箱子取出数据
        byte[] data = dp.getData();
        //String s = new String(data);

        System.out.println(new String(data));
        //关闭
        ds.close();

    }
}
