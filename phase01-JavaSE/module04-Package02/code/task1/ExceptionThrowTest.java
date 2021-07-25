package com.lagou.phase01.module04.code.task1;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionThrowTest {

    public static void show() throws IOException {

        FileInputStream fis = new FileInputStream("/Users/benjamin/test/text.txt");
        System.out.println("抛出异常后，会向下执行");
        fis.close();
    }

    public static void main(String[] args) {
        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
