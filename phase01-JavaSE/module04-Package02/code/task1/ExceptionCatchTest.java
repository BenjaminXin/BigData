package com.lagou.phase01.module04.code.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCatchTest {

    public static int test() {

        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            return 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {

        // 创建一个FileInputStream 类型的对象
        FileInputStream fis = null;
        try {
            System.out.println("1");
            fis = new FileInputStream("/Users/benjamin/test/text.txt");
            System.out.println("2");
        } catch (FileNotFoundException e) {
            System.out.println("3");
            e.printStackTrace();
            System.out.println("4");
        }

        // 关闭文件
        try {
            System.out.println("5");
            fis.close();
            System.out.println("6");
        } catch (IOException e) {
            System.out.println("7");
            e.printStackTrace();
            System.out.println("8");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
//            fis.close();
            System.out.println("this is in finally");
            System.out.println(test());
        }
        System.out.println("end");

    }
}
