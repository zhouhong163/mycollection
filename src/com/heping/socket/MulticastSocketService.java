package com.heping.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSocketService {
    public static void main(String[] args) throws IOException {
        //创建MulticastSocket组播对象
        MulticastSocket ms =new MulticastSocket(10001);
        DatagramPacket dp= new DatagramPacket(new byte[1024],1024);
        //把当前地址添加到组播
        ms.joinGroup(InetAddress.getByName("224.0.1.0"));
        ms.receive(dp);
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        ms.close();


    }
}
