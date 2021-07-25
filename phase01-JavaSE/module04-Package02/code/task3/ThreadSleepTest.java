package com.lagou.phase01.module04.code.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleepTest extends Thread {

    // 声明变量，用于记录是否退出线程
    private boolean flag = true;

    @Override
    public void run() {
        // 每隔一秒，获取一次系统时间，并打印
        while (flag) {
            // 获取当前系统时间，并调整格式

            //LocalDateTime.now();
            Date d1 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(d1));

            // 1秒
            // 子类中重写的方法，不能排除更大的异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        // 1. 对象
        ThreadSleepTest tst = new ThreadSleepTest();
        tst.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //tst.stop();
        tst.flag = false;
        System.out.println("main thread is done...");
    }
}
