package com.lagou.phase01.module04.code.task2;

import java.io.*;

public class BufferedByteCopyTest {

    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 1. BufferedInputStream 类型对象
            bis = new BufferedInputStream(new FileInputStream("/Users/benjamin/test/test.mp4"));

            // 2. BufferedOutputStream 类型对象
            bos = new BufferedOutputStream(new FileOutputStream("/Users/benjamin/test/test_bak1.mp4"));

            // 3. 拷贝
            System.out.println("copying...");

            byte[] bArrs = new byte[1024];
            int res = 0;
            while ((res = bis.read(bArrs)) != -1) {
                bos.write(bArrs, 0, res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
