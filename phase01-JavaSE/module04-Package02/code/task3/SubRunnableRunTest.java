package com.lagou.phase01.module04.code.task3;

public class SubRunnableRunTest {

    public static void main(String[] args) {

        // 1. 创建自定义类的对象
        SubRunnableRun src = new SubRunnableRun();

        // 2. 使用该对象，构造Thread类的对象
        Thread t1 = new Thread(src);

        // 3. 调用start方法
        t1.start();

        // main
        for (int i = 0; i <= 20; i++) {
            System.out.println("main- i: " + i);
        }
    }
}
