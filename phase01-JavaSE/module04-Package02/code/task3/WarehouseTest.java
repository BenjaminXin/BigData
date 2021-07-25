package com.lagou.phase01.module04.code.task3;

public class WarehouseTest {

    public static void main(String[] args) {

        // 1. 创建仓库类
        Warehouse warehouse = new Warehouse();

        // 2. 创建线程类，启动
        ProduceThread t1 = new ProduceThread(warehouse);
        ConsumerThread t2 = new ConsumerThread(warehouse);
        t1.start();
        t2.start();

        // 3.
    }
}
