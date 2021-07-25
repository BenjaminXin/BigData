package com.lagou.phase01.module04.code.task4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {

    public static void main(String[] args) {
        DatagramSocket ds = null;

        try {
            // 1. 创建DatagramSocket 类型的对象
            ds = new DatagramSocket();

            // 2. 创建 DatagramPacket 类型的对象，并提供接收方的通信地址和端口号
            byte[] bArr = "hello".getBytes();
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length, InetAddress.getLocalHost(), 8888);

            // 3. 通过Socket 发送 Packet，调用send方法
            ds.send(dp);
            System.out.println("发送数据成功...");

            // 接收发送方回复的数据
            byte[] bArr2 = new byte[20];
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length);
            ds.receive(dp2);
            System.out.println("接收到的回复数据： " + new String(bArr2, 0, dp2.getLength()));


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭
            if (ds != null) {
                ds.close();
            }
        }



    }
}
