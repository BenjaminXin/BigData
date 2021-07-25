package com.lagou.phase01.module04.code.task3;

public class ThreadDaemonTest extends Thread {

    @Override
    public void run() {
        System.out.println(isDaemon()? "守护线程": "不是守护线程");
        for (int i = 0; i < 50; i++) {
            System.out.println("sub thread i: " + i);
        }
    }

    public static void main(String[] args) {

        ThreadDaemonTest tdt = new ThreadDaemonTest();
        // 在线程启动之前，设置子线程为守护线程
        tdt.setDaemon(true);
        tdt.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("main thread i: " + i);
        }
    }
}
