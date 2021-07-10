package com.lagou.phase01.module03.code.task05;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        // 1. 实例化 Set类型的对象的引用，指向HashSet类型的对象
        Set<String> s1 = new HashSet<>();
        System.out.println("s1: " + s1);

        System.out.println("----------");
        // 2. 添加元素
        boolean b1 = s1.add("this");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("is");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("Benjamin");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);

        b1 = s1.add("Benjamin");
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
    }
}
