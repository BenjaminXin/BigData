package com.lagou.phase01.module04.code.task3;

import java.util.concurrent.locks.ReentrantLock;

public class AccountRunnableTest implements Runnable {

    private int balance;
    private Demo dm = new Demo();

    private ReentrantLock lock = new ReentrantLock();

    public AccountRunnableTest() {}

    public AccountRunnableTest(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountRunnableTest{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public /*synchronized*/ void run() {

        lock.lock();    // 加锁

        // run 方法是由 account对象调用，所以这里的 this 是 account对象
        // synchronized (this) {
        System.out.println("thread: " + Thread.currentThread().getName());
        //synchronized (dm) {
            // 1. 模拟从后台查询账户余额
            int temp = getBalance();

            // 2. 模拟取款200
            if (temp >= 200) {
                System.out.println("正在出钞...");
                temp -= 200;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("请取走钞票...");
            } else {
                System.out.println("余额不足...");
            }

            // 3. 模拟最新的账户余额写入到后台
            setBalance(temp);
        //}
        //}

        lock.unlock();  // 解锁
    }

    public static void main(String[] args) {

        // 1. 创建对象
        AccountRunnableTest account = new AccountRunnableTest(1000);
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.start();
        t2.start();

        System.out.println("main thread start...");
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终的账户余额: " + account.getBalance());
    }
}

class Demo {};