package com.lagou.phase01.module04.code.task5;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        // 1. 使用数据类型 .class 方式，获取对应类型的class对象
        Class c1 = String.class;
        System.out.println("c1: " + c1);
        c1 = int.class;
        System.out.println("c1: " + c1);
        c1 = void.class;
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 2. .getClass()
        String str = "hello";
        c1 = str.getClass();
        System.out.println("c1: " + c1);

        Integer it1 = 20;
        c1 = it1.getClass();
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 3. .TYPE
        c1 = Integer.TYPE;
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 4. Class.forName()
        c1 = Class.forName("java.lang.String");
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 5. ClassLoader
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        c1 = classLoader.loadClass("java.lang.String");
        System.out.println("c1: " + c1);
    }
}
