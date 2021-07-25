package com.lagou.phase01.module04.code.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBytesCopyTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1. 创建 FileInputStream 类的对象，读取图片文件
            fis = new FileInputStream("/Users/benjamin/test/test.jpeg");

            // 2. 创建 FileOutputStream 类的对象，写入图片文件
            fos = new FileOutputStream("/Users/benjamin/test/test_bak.jpeg");

            // 3.
            System.out.println("copying...");
            int res = 0;
            while ((res = fis.read()) != -1) {
                fos.write(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
