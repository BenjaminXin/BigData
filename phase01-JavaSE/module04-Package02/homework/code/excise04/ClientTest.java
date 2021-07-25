package com.lagou.phase01.module04.homework.excise04;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

    public static void main(String[] args) {
        Socket s = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        Scanner scanner = null;

        try {
            // 1. 创建 Socket 对象
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器...");
            // 2. 输入输出流通信
            // 用户输入内容
            scanner = new Scanner(System.in);

            oos = new ObjectOutputStream(s.getOutputStream());
            ois = new ObjectInputStream(s.getInputStream());

            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String pwd = scanner.next();
            oos.writeObject(new User(username, pwd));
            System.out.println("客户端 " + s.getInetAddress() + " 发送用户信息...");

            UserMessage userMessage = (UserMessage) ois.readObject();
            if ("success".equals(userMessage.getStatus())) {
                System.out.println("登录成功");
            } else if ("fail".equals(userMessage.getStatus())) {
                System.out.println("登录失败");
            } else {
                System.out.println("其他状况");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
