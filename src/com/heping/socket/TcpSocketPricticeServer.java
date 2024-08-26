package com.heping.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocketPricticeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10009);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        int b;
        while((b= is.read())!=-1){
            System.out.println((char)b);
        }

        OutputStream os = accept.getOutputStream();
        os.write("你谁啊".getBytes());
        os.close();
        is.close();
        accept.close();
        ss.close();


    }
}
