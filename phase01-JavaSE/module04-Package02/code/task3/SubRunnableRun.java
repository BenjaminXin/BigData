package com.lagou.phase01.module04.code.task3;

public class SubRunnableRun implements Runnable {

    @Override
    public void run() {
        // 打印 1～20 之间的数值
        for (int i = 0; i <= 20; i++) {
            System.out.println("run- i: " + i);
        }
    }

}
