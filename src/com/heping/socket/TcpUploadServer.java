package com.heping.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10008);
        Socket accept = ss.accept();//等待客户端连接
        //从网络中读到的图片也要存到本地
        BufferedInputStream bis =new BufferedInputStream(accept.getInputStream());
        //写到本地中  永久存储
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("mycollection\\aaa\\copy_周红.jpg"));

        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

        bw.write("上传成功");

        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        ss.close();
    }
}
