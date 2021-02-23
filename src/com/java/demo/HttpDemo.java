package com.java.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Calendar;

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
    }

    //200 OK：表示成功；
    //301 Moved Permanently：表示该URL已经永久重定向；
    //302 Found：表示该URL需要临时重定向；
    //304 Not Modified：表示该资源没有修改，客户端可以使用本地缓存的版本；
    //400 Bad Request：表示客户端发送了一个错误的请求，例如参数无效；
    //401 Unauthorized：表示客户端因为身份未验证而不允许访问该URL；
    //403 Forbidden：表示服务器因为权限问题拒绝了客户端的请求；
    //404 Not Found：表示客户端请求了一个不存在的资源；
    //500 Internal Server Error：表示服务器处理时内部出错，例如因为无法连接数据库；
    //503 Service Unavailable：表示服务器此刻暂时无法处理请求。

}
