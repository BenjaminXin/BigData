package com.lagou.phase01.module04.code.task3;

public class SubRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i+=2) {
            System.out.println("sub thread 1 i: " + i);
        }
    }
}
