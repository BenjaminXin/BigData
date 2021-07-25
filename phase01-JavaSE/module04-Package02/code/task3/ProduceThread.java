package com.lagou.phase01.module04.code.task3;

/**
 * 生产者线程，不断生产产品
 */
public class ProduceThread extends Thread {

    // 声明 仓库类的引用，以调用仓库类的生产方法 （合成复用原则）
    private Warehouse warehouse;

    public ProduceThread(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.produceProduct();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
