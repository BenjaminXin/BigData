package com.lagou.phase01.module03.code.task02;

public class StringRegMethodTest {

    public static void main(String[] args) {

        // 1. 构造字符串对象
        String str1 = "1001,benjamin,25";
        System.out.println("str1: " + str1);

        // 2. 对字符串进行切割
        String[] sArrs = str1.split(",");
        for (String s : sArrs) {
            System.out.println(s + " ");
        }
        System.out.println();

        System.out.println("----------");
        // 3. 字符串内容替换
        String str2 = "this is benjamin";
        String str3 = str2.replace('t', 'T');
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("----------");
        // 4. 替换所有指定的字符
        String str4 = str2.replace('s', 'S');
        System.out.println("str4: " + str4);

        System.out.println("----------");
        // 5. 只替换 第一个匹配reg的字符串
        String str5 = str2.replaceFirst("\\s\\w{2}", " is");
        System.out.println("str5: " + str5);

        System.out.println("----------");
        // 6. 替换所有 匹配reg的字符串
        String str6 = str4.replaceAll("[A-Z]", "#");
        System.out.println("str6: " + str6);





    }
}
