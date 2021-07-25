package com.lagou.phase01.module04.code.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;

        try {
            // 3. 使用输入输出流进行通信
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());

            // 客户端和服务器端不断通信
            while (true) {
                // 接受客户端发来的字符串，并打印
                String s1 = br.readLine();
                InetAddress inetAddress = s.getInetAddress();
                System.out.println("客户端" + inetAddress + "发来的字符是： " + s1);
                // 当从客户端接收到的消息是 "bye" 则停止进程
                if ("bye".equalsIgnoreCase(s1)) {
                    System.out.println("客户端" + inetAddress + "聊天停止...");
                    break;
                }

                // 服务器向客户端发送消息"received"
                ps.println("received");
                System.out.println("服务器发送数据成功...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
