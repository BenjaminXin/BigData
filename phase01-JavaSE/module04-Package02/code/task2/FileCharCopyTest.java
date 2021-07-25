package com.lagou.phase01.module04.code.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            // 1. FR对象
            fr = new FileReader("/Users/benjamin/test/text.txt");

            // 2. FW对象
            fw = new FileWriter("/Users/benjamin/test/text_bak.txt");

            // 3. 从 输入流读取字符，写入到 输出流
            System.out.println("copying...");
            int res = 0;
            while ((res = fr.read()) != -1) {
//                fw.write((char)res);
                fw.write(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象

            // 后打开的先关闭
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
