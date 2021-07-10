package com.lagou.phase01.module03.code.task03;

public class StringBuilderTest {

    public static void main(String[] args) {

        // 1. 构造StringBuilder 类的对象
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1: " + sb1);
        System.out.println("sb1's capacity: " + sb1.capacity());
        System.out.println("sb1's length: " + sb1.length());

        System.out.println("----------");
        // 2. 指定容量参数，构造对象
        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("sb2: " + sb2);
        System.out.println("sb2's capacity: " + sb2.capacity());
        System.out.println("sb2's length: " + sb2.length());

        System.out.println("----------");
        // 3. 指定字符串内容，构造对象
        StringBuilder sb3 = new StringBuilder("Benjamin");
        System.out.println("sb3: " + sb3);
        System.out.println("sb3's capacity: " + sb3.capacity());
        System.out.println("sb3's length: " + sb3.length());

        System.out.println("----------");
        // 4. 字符串增删替换和反转
        StringBuilder sb4 = sb3.append(" end");
        System.out.println("sb4: " + sb4);
        System.out.println("sb4: " + sb4.deleteCharAt(8));
        System.out.println("sb4: " + sb4.delete(8, 11));
        System.out.println("sb4 reverse: " + sb4.reverse());
        // 向末尾位置，插入字符串
        System.out.println("sb4: " + sb4.insert(sb4.length(), " end"));
        System.out.println("sb3: " + sb3);

        System.out.println("sb3's capacity: " + sb3.capacity());
        System.out.println("sb3: " + sb3.replace(0, 8, "Benjamin"));
        sb3.setCharAt(8, '-');
        System.out.println("sb3: " + sb3);

        System.out.println("----------");
        // 5. 笔试考点
        // - StringBuilder 类的字符串对象可以修改，为什么要有返回值
        //  方便连续调用
        sb3.reverse().reverse();
        System.out.println("sb3: " + sb3);
        //  如何 StringBuilder -> String
        String str3 = sb3.toString();
        //  String -> StringBuilder
        StringBuilder sb5 = new StringBuilder(str3);
        // - StringBuilder StringBuffer String 哪个效率高
        //  String < StringBuffer < StringBuilder



    }
}
