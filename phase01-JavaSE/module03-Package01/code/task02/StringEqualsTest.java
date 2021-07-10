package com.lagou.phase01.module03.code.task02;

import java.util.Scanner;

public class StringEqualsTest {

    public static void main(String[] args) {

        // 1. 提示用户收入用户名和密码
        for (int i = 3; i > 0; i--) {

            System.out.println("输入用户名和密码:");
            Scanner scanner = new Scanner(System.in);
            String user = scanner.next();
            String pwd = scanner.next();

            // 2. 判断用户名和密码是否为 admin 和 123456
            if ("admin".equals(user) && "123456".equals(pwd)) {
                System.out.println("login succeed");
                break;
            }
            if (i == 1) {
                System.out.println("this account is block, contact with service");
            } else {
                System.out.println("something wrong, you have " + (i-1) + " chance to try");
            }
        }

    }
}
