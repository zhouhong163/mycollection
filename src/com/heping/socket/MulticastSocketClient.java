package com.heping.socket;

import java.io.IOException;
import java.net.*;

public class MulticastSocketClient {
    public static void main(String[] args) throws IOException {
        // 创建一个DatagramSocket对象
  DatagramSocket ds =new DatagramSocket();
        // 定义一个字符串
        String s ="你好，组播发送";
        // 将字符串转换为字节数组
        byte[] bytes = s.getBytes();
        // 获取一个InetAddress对象
        InetAddress address = InetAddress.getByName("224.0.1.0");
        // 定义一个端口号
        int port =10001;
        // 创建一个DatagramPacket对象
        DatagramPacket dp =new DatagramPacket(bytes,bytes.length,address,port);
        // 发送DatagramPacket对象
        ds.send(dp);
        // 关闭DatagramSocket对象
        ds.close();
    }
}
