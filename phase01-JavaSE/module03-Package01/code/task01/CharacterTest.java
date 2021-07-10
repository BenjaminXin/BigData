package com.lagou.phase01.module03.code.task01;

public class CharacterTest {

    public static void main(String[] args) {

        // 1. java5 之前，手动拆箱装箱
        Character ca1 = Character.valueOf('a');
        System.out.println("ca1: " + ca1);
        char c1 = ca1.charValue();
        System.out.println("c1: " + c1);

        // 2. java5 之后，自动拆箱装箱
        Character ca2 = 'b';
        char c2 = ca2;
        System.out.println("ca2: " + ca2);
        System.out.println("c2: " + c2);

        System.out.println("-----------");
        // 3. 字符类型的判断
        System.out.println(Character.isUpperCase(c2));
        System.out.println(Character.isLowerCase(c2));
        System.out.println(Character.isDigit(c2));
        System.out.println("to uppercase: " + Character.toUpperCase(c2));
        System.out.println("to lowercase: " + Character.toLowerCase(c2));
    }
}
