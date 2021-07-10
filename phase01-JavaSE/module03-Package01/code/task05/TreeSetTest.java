package com.lagou.phase01.module03.code.task05;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        // 1. TreeSet 集合
        Set<String> s1 = new TreeSet<>();
        System.out.println("s1: " + s1);

        // 2. 添加元素
        boolean b1 = s1.add("this");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("thisis");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("Benjamin");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("benjamin");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        System.out.println("----------");
        // 3. 比较器
        //  匿名内部类： 接口/父类类型 引用变量名 = new 接口/父类类型() {方法重写}
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 根据年龄比较
                return o1.getAge() - o2.getAge();
            }
        };

        // Lambda 表达式： (参数列表) -> {方法体}
        Comparator<Student> comparator1 = (Student o1, Student o2) -> { return o1.getAge() - o2.getAge(); };

        System.out.println("----------");
        // 2. 放入 Student 类型的对象
        Set<Student> s2 = new TreeSet<>(comparator1);
        s2.add(new Student("Benjamin", 25));
        s2.add(new Student("Vivian", 20));
        s2.add(new Student("Tom", 20));
        System.out.println("s2: " + s2);


    }
}
