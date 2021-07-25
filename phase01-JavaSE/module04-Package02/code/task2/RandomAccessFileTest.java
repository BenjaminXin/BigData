package com.lagou.phase01.module04.code.task2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            // 1. 创建对象
            raf = new RandomAccessFile("/Users/benjamin/test/num.txt", "rw");

            // 2. 对文件内容随机读写

            // 设置偏移量
            raf.seek(2);
            int res = raf.read();
            System.out.println("data: " + (char)res);

            // 写入
            raf.write('3');
            System.out.println("data is wrote...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭对象
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
