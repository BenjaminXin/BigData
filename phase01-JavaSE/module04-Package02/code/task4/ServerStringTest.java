package com.lagou.phase01.module04.code.task4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStringTest {

    public static void main(String[] args) {

        ServerSocket ss = null;
        Socket s = null;


        try {
            // 1. 创建ServerSocket 类的对象
            ss = new ServerSocket(8888);

            while (true) {
                // 2. 等待客户端的连接请求，调用 accept 方法
                System.out.println("等待客户端的连接请求...");
                // 当没有客户端连接时，服务器阻塞在此方法的调用
                s = ss.accept();
                System.out.println("客户端连接成功！");

                // 每当有一个客户端连接成功，则需要启动一个新的线程
                new ServerThread(s).start();

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭对象
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
