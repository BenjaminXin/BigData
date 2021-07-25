package com.lagou.phase01.module04.code.task3;

public class ThreadNoNameTest {

    public static void main(String[] args) {

        // 匿名内部类
        //  父类/接口类型 引用变量名 = new 父类/接口类型() { 方法重写 };

        // 1. 继承 + 匿名内部类，创建线程对象并启动

        /*Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("this 1");
            }
        };
        t1.start();*/

        new Thread() {
            @Override
            public void run() {
                System.out.println("this 1");
            }
        }.start();

        // 2. 实现接口 + 匿名内部类，创建线程对象并启动
        /*Runnable ra = new Runnable() {
            @Override
            public void run() {
                System.out.println("this 2");
            }
        };
        Thread t2 = new Thread(ra);
        t2.start();*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this 2");
            }
        }).start();

        // lambda 表达式: (形参列表) -> {方法体;}
        Runnable ra = () -> {
            System.out.println("this 3");
        };

        new Thread(ra).start();

    }
}
