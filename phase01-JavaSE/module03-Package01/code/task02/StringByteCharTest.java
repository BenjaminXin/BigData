package com.lagou.phase01.module03.code.task02;

public class StringByteCharTest {

    public static void main(String[] args) {

        // 1. 创建String 类型的对象，并打印
        String str1 = new String("world");
        System.out.println("str1: " + str1);

        System.out.println("----------");
        // 2. 实现将String 类型转换为 byte[]
        byte[] bArrs = str1.getBytes();
        for (int i = 0; i < bArrs.length; i++) {
            System.out.print(bArrs[i] + " ");
        }

        // byte[] -> String
        String str2 = new String(bArrs);
        System.out.println("str2: " + str2);

        System.out.println("----------");
        // 3. String -> char[]
        char[] cArrs = str1.toCharArray();
        for (char c: cArrs) {
            System.out.print(c + " ");
        }

        // char[] -> String
        String str3 = new String(cArrs);
        System.out.println("str3: " + str3);

        System.out.println("----------");

    }
}
