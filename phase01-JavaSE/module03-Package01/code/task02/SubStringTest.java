package com.lagou.phase01.module03.code.task02;

import java.util.Scanner;

public class SubStringTest {

    public static void main(String[] args) {

        // 1. 构造String类型对象
        String str1 = new String("this is Benjamin");
        System.out.println("str1: " + str1);

        // 2. 截取字符串
        String str2 = str1.substring(8);
        System.out.println("str2: " + str2);

        String str3 = str1.substring(8, 11);
        System.out.println("str3: " + str3);

        System.out.println("----------");
        System.out.println("输入一个字符串和字符，输出该字符(此字符不包含)后的所有子字符串");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        int pos = str1.indexOf(c);
        if (pos != -1) {
            String str4 = str1.substring(pos+1);
            System.out.println("str4: " + str4);
        } else {
            System.out.println("this character is not exist");
        }

    }
}
