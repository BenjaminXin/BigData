package com.lagou.phase01.module03.code.task02;

public class StringPoolTest {

    public static void main(String[] args) {

        // 1. 字符串常量池
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
    }
}
