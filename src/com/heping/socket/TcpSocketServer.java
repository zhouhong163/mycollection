package com.heping.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10003);
        System.out.println(111);
        Socket accept = ss.accept();//监听客户端 一直等待连接直到有连接为止
        System.out.println(3333);
        InputStream inputStream = accept.getInputStream();
        int b;
        while((b=inputStream.read())!=-1){
            System.out.print((char)b);
        }

        inputStream.close();
        ss.close();
    }
}
