package com.lagou.phase01.module04.code.task2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            // 1. 创建对象
            dis = new DataInputStream(new FileInputStream("/Users/benjamin/test/num1.txt"));

            // 2. 读取整数
            int res = dis.readInt();
            System.out.println("num: " + res);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭对象
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
