package com.lagou.phase01.module03.code.task02;

public class StringJudgeTest {

    public static void main(String[] args) {

        // 1. 创建字符串对象
        String str1 = new String("上海自来水自海上");
        System.out.println("str1: " + str1);

        // 2. 判断是否为回文
        for (int i = 0; i < str1.length() / 2; i++) {
            // 前后对应位置相比较
            if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                System.out.println("nope");
                return; // 返回，退出方法
            }
        }
        System.out.println("yep");
    }
}
