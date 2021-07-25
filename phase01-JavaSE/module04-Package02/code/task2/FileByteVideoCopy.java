package com.lagou.phase01.module04.code.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteVideoCopy {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        System.out.println("copying...");
        try {
            // 1. 输入流对象
            fis = new FileInputStream("/Users/benjamin/test/test.mp4");

            // 2. 输出流对象
            fos = new FileOutputStream("/Users/benjamin/test/test_bak.mp4");

            // 3. 拷贝
//            int len = 0;
//            len = fis.available();
//            System.out.println("video's size: " + len);
//            byte[] bArrs = new byte[len];
//            int res = fis.read(bArrs);
//            System.out.println("read size: " + res);
//            fos.write(bArrs);
//            System.out.println("copy processing is done...");

            byte[] bArrs = new byte[1024];
            int res = 0;
            while ((res = fis.read(bArrs)) != 1) {
                fos.write(bArrs, 0, res);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭对象
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
