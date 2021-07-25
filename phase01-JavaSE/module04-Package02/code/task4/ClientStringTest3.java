package com.lagou.phase01.module04.code.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientStringTest3 {

    public static void main(String[] args) {
        Socket s = null;

        PrintStream ps = null;
        Scanner sc = null;
        BufferedReader br = null;
        try {
            // 1. 创建 Socket 类型的对象
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器成功...");
            // 2. 输入输出流通信
            // 用户输入内容，由客户端发送
            sc = new Scanner(System.in);
            //
            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while (true) {
                System.out.println("输入要发送的内容：");
                String str1 = sc.next();

                // 实现客户端向服务器发送字符串内容
                // Thread.sleep(5000);
                ps.println(str1);
                System.out.println("客户端" + s.getInetAddress() +"发送数据内容成功...");

                // 发送 "bye" 则结束进程
                if ("bye".equalsIgnoreCase(str1)) {
                    System.out.println("聊天结束...");
                    break;
                }

                // 从服务器接受消息
                String str2 = br.readLine();
                System.out.println("服务器发送的消息： " + str2);
            }

        } catch (IOException /*| InterruptedException*/ e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭对象
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                ps.close();
            }

            if (sc != null) {
                sc.close();
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
