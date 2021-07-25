package com.lagou.phase01.module04.code.task3;

public class AccountThreadTest extends Thread {

    private int balance;
    private static Demo dm = new Demo();

    public AccountThreadTest() {}

    public AccountThreadTest(int balance) {
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
    public void run() {
        System.out.println("thread: " + Thread.currentThread().getName());
        //synchronized (dm) {
        func(this);
        //}
    }

    public static void func(AccountThreadTest account) {
        // 1. 模拟从后台查询账户余额
        int temp = account.getBalance();

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
        account.setBalance(temp);
    }

    public static void main(String[] args) {

        AccountThreadTest att1 = new AccountThreadTest(1000);
        att1.start();

        AccountThreadTest att2 = new AccountThreadTest(1000);
        att2.start();

        System.out.println("main thread...");
        try {
            att1.join();
            att2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("账户余额：" + att1.getBalance());
    }

}
