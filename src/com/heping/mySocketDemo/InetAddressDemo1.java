package com.heping.mySocketDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        String hostName = inetAddress.getHostName();
        /*String[] split = hostName.split("\\.");
        System.out.println(split[0]);*/


        System.out.println(hostName);
        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);

    }
}
