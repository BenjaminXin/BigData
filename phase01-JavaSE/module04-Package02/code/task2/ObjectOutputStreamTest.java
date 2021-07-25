package com.lagou.phase01.module04.code.task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            // 1. 对象
            oos = new ObjectOutputStream(new FileOutputStream("/Users/benjamin/test/object.txt"));

            // 2. User类型对象
            User user = new User("tom", "123456", "12345678910");

            // 3. 序列化
            oos.writeObject(user);
            System.out.println("序列化完成...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭
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
