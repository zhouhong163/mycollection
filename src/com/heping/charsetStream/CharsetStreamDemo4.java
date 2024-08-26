package com.heping.charsetStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharsetStreamDemo4 {
    //输入账号密码保存到硬盘 各占一行
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入您的账号");
        String username = sc.next();
        System.out.println("请输入您的密码");
        String password = sc.next();

        //保存到硬盘
        FileWriter fw=new FileWriter(new File("mycollection//aaa//userpass.txt"));
        fw.write(username+"\r\n"+password);//换行
        fw.close();
    }
}
