package com.lagou.phase01.module04.code.task3;

public class ThreadIdNameTest {

    public static void main(String[] args) {

        // 1. 自定义类，继承 Thread 类, 重写 run 方法
        // 匿名内部类
        Thread t1 = new Thread("this 0") {
            @Override
            public void run() {
                System.out.println("thread id: " + this.getId());
                System.out.println("thread name: " + this.getName());
                this.setName("this 1");
                System.out.println("thread id: " + this.getId());
                System.out.println("thread name: " + this.getName());
            }
        };
        t1.start();

        Thread t2 = Thread.currentThread();
        System.out.println("main thread id: " + t2.getId());
        System.out.println("main thread name: " + t2.getName());

    }
}
