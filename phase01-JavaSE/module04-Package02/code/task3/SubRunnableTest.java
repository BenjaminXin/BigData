package com.lagou.phase01.module04.code.task3;

public class SubRunnableTest {

    public static void main(String[] args) {

        SubRunnable1 sr1 = new SubRunnable1();
        SubRunnable2 sr2 = new SubRunnable2();

        Thread t1 = new Thread(sr1);
        Thread t2 = new Thread(sr2);

        t1.start();
        t2.start();

        System.out.println("main thread start...");
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end...");
    }
}
