package com.heping.socket;

import java.io.*;
import java.net.Socket;

public class TcpUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("127.0.0.1",10008);

        //先把本地文件读到内存中
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("mycollection\\aaa\\周红_证件照.1.jpg"));
        //写到服务器中  网络流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos =new BufferedOutputStream(os);
        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }
        socket.shutdownOutput();//结束标记，告诉服务器已经上传完毕

        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        bis.close();

        socket.close();




    }
}
