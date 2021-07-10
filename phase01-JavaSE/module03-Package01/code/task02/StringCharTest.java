package com.lagou.phase01.module03.code.task02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringCharTest {

    public static void main(String[] args) {

        // 1. 构造String类型的对象
        String str1 = new String("hello");
        System.out.println("str1: " + str1);

        // 2. 输出字符串长度
        System.out.println("str1 length: " + str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.print("index " + (i+1) + ": " + str1.charAt(i) + ", ");
        }
        System.out.println();

        // 3. 判断字符串是否为空
        System.out.println(0 == str1.length()? "nope" : "yep");

        str1 = "";
        System.out.println(str1.isEmpty()? "nope" : "yep");

        // 4. 笔试考点
        // 两种方式，字符串"12345" -> 整数12345
        String str2 = new String("12345");
        int ia = Integer.parseInt(str2);
        System.out.println("ia: " + ia);

        // 利用 ASCII 码
        byte[] bArrs = str2.getBytes();
        int ib = 0;
        for (int i = 0; i < bArrs.length; i++) {
            ib = ib * 10 + bArrs[i] - 48;
        }
        System.out.println("ib: " + ib);

        // 或者
        int ic = 0;
        for (int i = 0; i < str2.length(); i++) {
            ic = ic * 10 + str2.charAt(i) - '0';
        }
        System.out.println("ic: " + ic);

        System.out.println("----------");
        // 12345 -> String
        String str6 = "" + ia;
        System.out.println("str6: " + str6);
    }

}
