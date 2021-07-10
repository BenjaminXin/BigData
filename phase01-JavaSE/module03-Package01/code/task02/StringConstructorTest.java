package com.lagou.phase01.module03.code.task02;

public class StringConstructorTest {

    public static void main(String[] args) {

        // 1. 无参方式构造对象
        String str1 = new String();
        System.out.println("str1: " + str1);

        System.out.println("---------");
        // 2. byte数组构造对象
        byte[] bArr = {97, 98, 99, 100, 101};   // a - e
        String str2 = new String(bArr, 1, 3);
        String str3 = new String(bArr);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("---------");
        // 3. char数组，构造对象，形成副本
        char[] sArr = {'a', 'b', 'c', 'd', 'e'};
        String str4 = new String(sArr, 1, 3);
        String str5 = new String(sArr);
        System.out.println("str4: " + str2);
        System.out.println("str5: " + str3);

        System.out.println("----------");
        // 4. String 构造对象，形成副本
        String s = "hello world";
        String str6 = new String(s);
        System.out.println("str6: " + str6 + ", s: " + s);
        System.out.println(str6 == s);

        String str7 = "hello " + "world";
        System.out.println(s == str7);
    }
}
