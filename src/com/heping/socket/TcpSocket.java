package com.heping.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpSocket {
    public static void main(String[] args) throws IOException {
        //tcp协议
        Socket sc =new Socket("127.0.0.1",10003);
        OutputStream os = sc.getOutputStream();
        os.write("hello tcp".getBytes());
        os.close();
        sc.close();



    }
}
