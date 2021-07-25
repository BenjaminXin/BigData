package com.lagou.phase01.module04.code.task3;

public class ThreadPriorityTest extends Thread {

    @Override
    public void run() {
        System.out.println("sub thread priority: " + getPriority());
        for (int i = 0; i <= 20; i++) {
            System.out.println("sub thread i: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadPriorityTest tpt = new ThreadPriorityTest();
        tpt.start();

        Thread t1 = Thread.currentThread();
        System.out.println("main thread priority: " + t1.getPriority());

        for (int i = 0; i <= 20; i++) {
            System.out.println("main thread i: " + i);
        }
    }

}
