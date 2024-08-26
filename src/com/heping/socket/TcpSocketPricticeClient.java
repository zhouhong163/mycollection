package com.heping.socket;

import java.io.*;
import java.net.Socket;

public class TcpSocketPricticeClient {
    public static void main(String[] args) throws IOException {
        //tcp发和接收
        Socket socket =new Socket("127.0.0.1",10009);
        OutputStream os = socket.getOutputStream();
        os.write("hello tcp".getBytes());
        //仅仅关流  结束标记
        socket.shutdownOutput();

        /*InputStream is = socket.getInputStream();
        int b;
        while((b= is.read())!=-1){
            System.out.println((char)b);
        }*/
        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line= br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
        os.close();
        socket.close();



    }
}
