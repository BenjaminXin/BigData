package com.lagou.phase01.module03.code.task02;

public class StringCompareTest {

    public static void main(String[] args) {

        // 1. 创建两个字符串对象
        String str1 = new String("hello");
        System.out.println("str1: " + str1);


        // 2. 与其他字符串对象比较大小
        System.out.println(str1.compareTo("he"));
        System.out.println(str1.compareTo("world"));
        System.out.println(str1.compareTo("haha"));
        System.out.println(str1.compareTo("helloworld"));
        System.out.println(str1.compareToIgnoreCase("HELLO"));
    }
}
