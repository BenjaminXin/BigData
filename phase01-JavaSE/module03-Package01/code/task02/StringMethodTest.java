package com.lagou.phase01.module03.code.task02;

import java.util.Locale;

public class StringMethodTest {

    public static void main(String[] args) {

        // 1. 构造String 类型的对象
        String str1 = new String("  this is benjamin   ");
        System.out.println("str1: " + str1);

        // 2. 各种方法调用
        boolean b1 = str1.contains("Is");
        System.out.println("b1: " + b1);
        b1 = str1.contains("is");
        System.out.println("b1: " + b1);

        System.out.println("---------");
        // 大小写，去除空格
        String str2 = str1.toUpperCase();
        System.out.println("str2: " + str2);
        String str3 = str1.toLowerCase();
        System.out.println("str3: " + str3);
        String str4 = str1.trim();
        System.out.println("str4: " + str4);

        System.out.println("----------");
        // 以什么开头，以什么结尾
        b1 = str1.startsWith("this");
        System.out.println("b1: " + b1);
        b1 = str1.startsWith("  ");
        System.out.println("b1: " + b1);
        b1 = str1.startsWith("this", 2);
        System.out.println("b1: " + b1);
        b1 = str4.endsWith("min");
        System.out.println("b1: " + b1);
    }
}
