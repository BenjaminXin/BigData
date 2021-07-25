package com.lagou.phase01.module04.code.task3;

/**
 * 仓库类
 */
public class Warehouse {

    private int cnt = 0;   // 记录产品的数量

    public synchronized void produceProduct() {
        notify();
        if (cnt < 10) {
            System.out.println("thread: " + Thread.currentThread().getName() + " producing " + (cnt + 1) + " product");
            cnt++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumeProduct() {
        notify();
        if (cnt > 0) {
            System.out.println("thread: " + Thread.currentThread().getName() + " producing " + cnt + " product");
            cnt--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
