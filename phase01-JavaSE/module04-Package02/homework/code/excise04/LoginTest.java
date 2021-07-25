package com.lagou.phase01.module04.homework.excise04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginTest {

    public static void main(String[] args) {

        ServerSocket ss = null;
        try {
            ss = null;
            Socket s = null;

            // 1. 创建 ServerSocket 类的对象
            ss = new ServerSocket(8888);

            // 2. 等待客户端的连接请求，调用accept 方法
            System.out.println("等待客户端连接...");
            s = ss.accept();
            System.out.println("客户端连接成功");

            //  每当有一个客户端连接成功，则启动一个新的线程
            new ServerThread(s).start();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
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
