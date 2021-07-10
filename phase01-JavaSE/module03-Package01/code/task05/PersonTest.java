package com.lagou.phase01.module03.code.task05;

public class PersonTest {

    public static void main(String[] args) {

        // 1. 实例化Person 范型类的对象
        Person p1 = new Person("Benjamin", 25, 1);

        Person p2 = new Person("Sunsha", 24, 0);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        System.out.println("----------");
        // 2. 指定 gender 的类型
        Person<String> p3 = new Person<String>();
        p3.setAge(21);
        p3.setName("Tom");
        p3.setGender("male");
        System.out.println("p3: " + p3);

        Person<Boolean> p4 = new Person<Boolean>("vivian", 22, false);
        System.out.println("p4: " + p4);

        System.out.println("----------");
        // 3. 调用泛型方法
        Integer[] arr = {1, 2, 3, 4, 5};
        p1.printArray(arr);

    }
}
