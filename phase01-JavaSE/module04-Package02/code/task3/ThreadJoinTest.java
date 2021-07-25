package com.lagou.phase01.module04.code.task3;

public class ThreadJoinTest extends Thread {

    @Override
    public void run() {
        // 倒计时
        System.out.println("count down...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("fire!");
    }

    public static void main(String[] args) {

        ThreadJoinTest tjt = new ThreadJoinTest();
        tjt.start();

        System.out.println("main thread start...");
        try {
            // 等到线程终止
            // tjt.join();
            tjt.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
