package com.heping.socket;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.net.*;

public class MySocketDemo1 {
    public static void main(String[] args) throws IOException {
        //UPD协议  不用连接 数据丢失一点没事
        //发送端
        //1.新建发送端对象
        DatagramSocket ds =new DatagramSocket();
        //2.打包数据
        String data ="给你的一份礼物";
        byte[] bytes = data.getBytes();//转化字节码文件
        InetAddress addresss = InetAddress.getByName("127.0.0.1");//发给本机
        int port =2000;
        DatagramPacket dp =new DatagramPacket(bytes,bytes.length,addresss,port);
        //3.发送数据
        ds.send(dp);
        //关闭
        ds.close();


    }
}
