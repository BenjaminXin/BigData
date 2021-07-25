package com.lagou.phase01.module04.code.task3;

public class SubThreadRunTest {

    public static void main(String[] args) {

        // 1. 声明 Thread 类型的引用，指向子类类型的对象
        Thread t1 = new SubThreadRun();
        // 2. 调用 run 方法
        // t1.run();
        t1.start();

        // 打印 1～20 之间的整数
        //for (int i = 0; i <= 20; i++) {
        for (int j = 0; j <= 20; j++) {
            //System.out.println("main- i: " + i);
            System.out.println("main- i: " + j);
        }
    }
}
