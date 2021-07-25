package com.lagou.phase01.module04.code.task2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            // 1. 创建对象
            dos = new DataOutputStream(new FileOutputStream("/Users/benjamin/test/num1.txt"));

            // 2. 整数数据，写入输出流
            int num = 66;
            dos.writeInt(num);
            System.out.println("data is wrote...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭对象
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
