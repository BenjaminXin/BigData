package com.lagou.phase01.module04.code.task4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTest {

    public static void main(String[] args) {

        DatagramSocket ds = null;

        try {
            // 1. 创建DatagramSocket 类的对象，并提供端口号
             ds = new DatagramSocket(8888);

            // 2. 创建DatagramPacket 类的对象，并提供缓冲区
            byte[] bArr = new byte[20];
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length);
            // 3. 通过 Socket 接收数据内容存放到 Packet 内，调用 receive 方法
            System.out.println("等待数据接收...");
            ds.receive(dp);
            System.out.println("接收到的数据： " + new String(bArr));

            // 接收数据后，回复 "received"
            byte[] bArr2 = "received".getBytes();
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length, dp.getAddress(), dp.getPort());
            ds.send(dp2);
            System.out.println("回复成功...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭对象
            if (ds != null) {
                ds.close();
            }
        }
    }
}
