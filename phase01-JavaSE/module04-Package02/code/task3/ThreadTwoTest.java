package com.lagou.phase01.module04.code.task3;

public class ThreadTwoTest {

    public static void main(String[] args) {

        SubThread1 st1 = new SubThread1();
        SubThread2 st2 = new SubThread2();

        st1.start();
        st2.start();

        System.out.println("main thread start...");
        try {
            st1.join();
            st2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread end...");
    }

}
