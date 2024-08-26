package com.heping.socket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        //udp发送 键盘输入 直到886 发送结束
        Scanner sc =new Scanner(System.in);
        DatagramSocket ds =new DatagramSocket();
        while (true) {
            String input = sc.nextLine();
            if("886".equals(input)){
                break;
            }
            byte[] bytes = input.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port =10000;
            DatagramPacket dp =new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
        }

        ds.close();



    }
}
