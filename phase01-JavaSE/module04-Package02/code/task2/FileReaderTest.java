package com.lagou.phase01.module04.code.task2;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        // 1. 实例化对象
        FileReader fr = null;
        FileReader fr2 = null;
        try {
            fr = new FileReader("/Users/benjamin/test/text.txt");

            // 2. 读取数据内容
            int res = fr.read();
            while ((res = fr.read()) != -1) {
                System.out.println("single char: " + (char)res);
            }

//            fr2 = new FileReader("/Users/benjamin/test/text.txt");
//            // 字符数组，保存读取到的数组内容
//            char[] cArrs = new char[5];
//            int res2 = fr2.read(cArrs, 1, 4);
//            System.out.println("char array: " + res2);
//            for (char cv : cArrs) {
//                System.out.println("char: " + cv);
//            }
            fr2 = new FileReader("/Users/benjamin/test/text.txt");
            // 字符数组，保存读取到的数组内容
            char[] cArrs = new char[5];
            int res2 = fr2.read(cArrs);
            System.out.println("char array: " + res2);
            for (char cv : cArrs) {
                System.out.println("char: " + cv);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流对象
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
