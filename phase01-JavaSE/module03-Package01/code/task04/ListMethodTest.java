package com.lagou.phase01.module03.code.task04;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {

    public static void main(String[] args) {

        // 1. 声明 List 集合
        List lt1 = new LinkedList();
        System.out.println("lt1: " + lt1);

        System.out.println("----------");
        // 2. 添加元素
        lt1.add(0, "one");
        System.out.println("lt1: " + lt1);
        // 末尾添加
        lt1.add(1, "three");
        System.out.println("lt1: " + lt1);
        // 中间添加
        lt1.add(1, 2);
        System.out.println("lt1: " + lt1);

        System.out.println("----------");
        // 3. 根据参数指定的下标获取元素
        String str1 = (String) lt1.get(0);
        System.out.println("str1: " + str1);
        Object str2 = lt1.get(1);
        System.out.println("str2: " + str2);
        System.out.println(str2.getClass());

        System.out.println("----------");
        // 4. 查找元素出现的第一个位置
        System.out.println("one 出现的位置: " + lt1.indexOf("one"));
        System.out.println("three 出现的位置: " + lt1.lastIndexOf("three"));

        System.out.println("----------");
        // 5. 修改指定位置的元素
        lt1.set(1, "two");
        lt1.set(2, 3);
        System.out.println("lt1: " + lt1);

        System.out.println("----------");
        // 6. 删除指定位置的元素
        lt1.add(3, "this");
        System.out.println("lt1: " + lt1);
        lt1.remove(3);
        System.out.println("lt1: " + lt1);

        // 删除所有元素
        List lt2 = new LinkedList();
        lt2.addAll(lt1);
//        for (int i = 0; i < lt2.size();) {
        for (int i = lt2.size() - 1; i >= 0; i--) {
            lt2.remove(i);
        }
        System.out.println("lt2: " + lt2);
        System.out.println("lt1: " + lt1);

        System.out.println("----------");
        List subList = lt1.subList(1, 3);
        System.out.println("subList: " + subList);
    }
}
