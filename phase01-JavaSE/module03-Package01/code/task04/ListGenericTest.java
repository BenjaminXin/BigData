package com.lagou.phase01.module03.code.task04;

import java.util.LinkedList;
import java.util.List;

public class ListGenericTest {

    public static void main(String[] args) {

        // 1. 实例化一个有范型的List集合
        List<String> lt1 = new LinkedList<String>();

        // 2. 添加元素
        lt1.add("this");
        lt1.add("is");
        lt1.add("Benjamin");
        System.out.println("lt1: " + lt1);

        // 3. 获取集合中的元素
        for (String s : lt1) {
            System.out.println(s);
        }

        System.out.println("----------");
        // 4. Integer 类型的List集合



    }
}
