package com.lagou.phase01.module04.code.task3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        // 计算 1 ～ 1000 之间的累加和
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("累加和: " + sum);
        return sum;
    }

    public static void main(String[] args) {

        ThreadCallableTest tct = new ThreadCallableTest();

        // 创建Future 对象
        FutureTask ft = new FutureTask(tct);

        // 生成线程，启动
        Thread t1 = new Thread(ft);
        t1.start();

        Object obj = null;
        try {
            obj = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("线程处理方法的返回值：" + obj);
    }
}


