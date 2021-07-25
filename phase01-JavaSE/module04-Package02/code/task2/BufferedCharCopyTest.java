package com.lagou.phase01.module04.code.task2;

import java.io.*;

public class BufferedCharCopyTest {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // 1. 创建BufferedReader 类对象
            br = new BufferedReader(new FileReader("/Users/benjamin/test/text.txt"));

            // 2. 创建BufferedWriter 类对象
            bw = new BufferedWriter(new FileWriter("/Users/benjamin/test/text_bak1.txt"));

            // 3. 拷贝
            System.out.println("copying...");
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
