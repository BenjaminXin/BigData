package com.lagou.phase01.module04.code.task2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        // 1. 构造 FileWriter 对象
        FileWriter fw = null;

        try {
            //fw = new FileWriter("/Users/benjamin/test/text.txt");
            fw = new FileWriter("/Users/benjamin/test/text.txt", true);

            // 2. 通过流对象，写入数据内容
            fw.write("a");

            // 3. 写入字符数组
            char[] cArrs = new char[]{'h', 'e', 'l', 'l', 'o'};
            fw.write(cArrs, 1, 3);
            fw.write(cArrs);
            System.out.println("wrote...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流对象
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("----------");



    }
}
