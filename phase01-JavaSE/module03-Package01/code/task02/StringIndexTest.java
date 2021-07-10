package com.lagou.phase01.module03.code.task02;

public class StringIndexTest {

    public static void main(String[] args) {

        // 1. 构造String 类型对象
        String str1 = new String("this is benjamin");
        System.out.println("str1: " + str1);

        // 2. 指定字符和字符串的查找
        int pos = str1.indexOf('s');
        System.out.println("pos: " + pos);

        pos = str1.indexOf('s', 4);
        System.out.println("pos: " + pos);

        System.out.println("----------");
        pos = str1.indexOf("is");
        System.out.println("pos: " + pos);
        pos = str1.indexOf("is", 4);
        System.out.println("pos: " + pos);

        // 3. 查找所有的"is"
        pos = str1.indexOf("is");
        while (pos != -1) {
            System.out.println("pos: " + pos);
            pos = str1.indexOf("is", pos + 1);
        }

        System.out.println("-----------");
        // 优化
        pos = 0;
        while ((pos = str1.indexOf("is", pos)) != -1) {
            System.out.println("pos: " + pos);
            pos += "is".length();
        }

        System.out.println("----------");
        // 4. 反向查找
        pos = str1.lastIndexOf('s');
        System.out.println("pos: " + pos);

        pos = str1.lastIndexOf('s', 5);
        System.out.println("pos: " + pos);

        pos = 0;
        while ((pos = str1.lastIndexOf("is", pos)) != -1) {
            System.out.println("pos: " + pos);
            pos -= "is".length();
        }
    }
}
