package com.lagou.phase01.module04.code.task3;

public class SubThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 100; i+=2) {
            System.out.println("sub thread 2 i: " + i);
        }
    }
}
