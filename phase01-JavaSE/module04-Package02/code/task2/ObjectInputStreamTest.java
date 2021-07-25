package com.lagou.phase01.module04.code.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            // 1. 创建对象
            ois = new ObjectInputStream(new FileInputStream("/Users/benjamin/test/object.txt"));

            // 2. 读取序列化对象
            Object obj = ois.readObject();
            System.out.println("读取到的对象： " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭对象
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
