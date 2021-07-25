package com.lagou.phase01.module04.code.task3;

public class ThreadCommunicateTest implements Runnable {

    private int cnt = 1;
    //private Integer cnt = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 线程进来后，唤醒，调用 notify() 方法
                notify();

                if (cnt <= 100) {
                    System.out.println("thread: " + Thread.currentThread().getName() + ", cnt: " + cnt);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt++;
                    // 当前线程打印后，调用wait方法，让其他线程占用时间片
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        ThreadCommunicateTest tct = new ThreadCommunicateTest();
        Thread t1 = new Thread(tct);
        t1.start();

        Thread t2 = new Thread(tct);
        t2.start();
    }
}
