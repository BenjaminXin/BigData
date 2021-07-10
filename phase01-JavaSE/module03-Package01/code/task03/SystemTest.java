package com.lagou.phase01.module03.code.task03;

public class SystemTest {

    public static void main(String[] args) {

        // 1. 获取当前系统时间的时间戳
        //  通常用于测试某一段代码的执行效率
        long t1 = System.currentTimeMillis();
        System.out.println("t1: " + t1);
    }
}
