package com.java.demo;

import java.io.IOException;
import java.net.ServerSocket;

public class HttpDemo {

    // 计算机网络的基本概念
    // 计算机网络：由两台或更多计算机组成的网络；
    // 互联网：连接网络的网络；
    // IP地址：计算机的网络接口（通常是网卡）在网络中的唯一标识；
    // 网关：负责连接多个网络，并在多个网络之间转发数据的计算机，通常是路由器或交换机；
    // 网络协议：互联网使用TCP/IP协议，它泛指互联网协议簇；
    // IP协议：一种分组交换传输协议；
    // TCP协议：一种面向连接，可靠传输的协议；
    // UDP协议：一种无连接，不可靠传输的协议。

    public static void main(String[] args) throws IOException {
        ServerSocket ss  = new ServerSocket(8080);
        System.out.print(ss);
    }

}
