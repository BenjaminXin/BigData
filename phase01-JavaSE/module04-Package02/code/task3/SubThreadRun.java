package com.lagou.phase01.module04.code.task3;

public class SubThreadRun extends Thread {

    @Override
    public void run() {
        // 打印 1～20 之间的所有整数
        for (int i = 1; i <= 20; i++) {
            System.out.println("run- i: " + i);
        }
    }

}
