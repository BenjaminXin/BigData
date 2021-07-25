package com.lagou.phase01.module04.homework.excise04;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            // 3. 使用输入输出流进行通信
            ois = new ObjectInputStream(s.getInputStream());
            oos = new ObjectOutputStream(s.getOutputStream());

            // 接受客户端发来的字符串
            User user = (User) ois.readObject();
            InetAddress inetAddress = s.getInetAddress();
            System.out.printf("客户端 " + inetAddress + "发来的用户信息是：" + user.toString());
            if ("admin".equals(user.getUsername()) && "123456".equals(user.getPwd())) {
                oos.writeObject(new UserMessage("success", user));
            } else {
                oos.writeObject(new UserMessage("fail", user));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
