package com.lagou.phase01.module03.code.task01;

public class StudentTest {

    public static void main(String[] args) {





        // 1. 有参方式，构造Student类的对象, 并判断两个对象是否相等
        Student s1 = new Student(1001, "Benjamin");
        //Student s2 = new Student(1002, "Tom");
        Student s2 = new Student(1001, "Tom");
        Student s3 = null;

//        boolean b1 = s1.equals(s2);
        boolean b1 = s1.equals(s2);
        System.out.println("b1: " + b1);
        System.out.println(s1 == s2);

        // 2. 调用Object类中的hashCode() 方法
        System.out.println("----------");
        int ia = s1.hashCode();
        int ib = s2.hashCode();
        System.out.println("ia: " + ia);
        System.out.println("ib: " + ib);

        // 3. 从Object类中继承toString方法，获取调用对象的字符串形式：包名.类名@哈希码的十六进制形式
        System.out.println("----------");
        String str1 = s1.toString();
        System.out.println("s1: " + s1);
        // 会自动调用toString方法
        System.out.println(s1);

    }
}
