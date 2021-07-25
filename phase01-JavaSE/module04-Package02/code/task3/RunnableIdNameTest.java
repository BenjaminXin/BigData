package com.lagou.phase01.module04.code.task3;

public class RunnableIdNameTest {
//public class RunnableIdNameTest implements Runnable {

  /*  @Override
    public void run() {
        // 获取当前正在执行线程的引用
        Thread t1 = Thread.currentThread();
        System.out.println("thread id: " + t1.getId() + " name: " + t1.getName());
    }*/
    public static void main(String[] args) {

/*        RunnableIdNameTest rint = new RunnableIdNameTest();
        Thread t2 = new Thread(rint);
        t2.start();*/

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                Thread t1 = Thread.currentThread();
                System.out.println("thread id: " + t1.getId() + " name: " + t1.getName());
            }
        };
        Thread t2 = new Thread(r1);
        t2.start();


        // main
        Thread t1 = Thread.currentThread();
        System.out.println("main thread id: " + t1.getId() + " name: " + t1.getName());

    }
}
