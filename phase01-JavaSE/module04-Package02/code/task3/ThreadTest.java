package com.lagou.phase01.module04.code.task3;

public class ThreadTest {

    public static void main(String[] args) {

        // 1. 无参构造
        Thread t1 = new Thread();

        // 2. 调用run方法
        t1.run();

        // 3. 打印测试
        System.out.println("end");
    }
}
