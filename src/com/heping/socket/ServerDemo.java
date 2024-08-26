package com.heping.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.SQLOutput;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(10000);

        while (true) {
            byte [] bytes =new byte[1024];

            //DatagramPacket dp =new DatagramPacket(bytes,bytes.length);
            DatagramPacket dp =new DatagramPacket(bytes,bytes.length);

            ds.receive(dp);

            byte[] data = dp.getData();

            int length = dp.getLength();//发送了多少个字节

            System.out.println(new String(data,0,length));
        }

        //ds.close();


    }
}
