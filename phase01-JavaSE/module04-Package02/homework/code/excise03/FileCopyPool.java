package com.lagou.phase01.module04.homework.excise03;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileCopyPool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入要拷贝的目录路径 以及 目标目录的路径
        System.out.println("请输入要拷贝的目录路径:");
        String filepath = scanner.next();
        System.out.println("请输入目标目录路径:");
        String topath = scanner.next();


        // 1. 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // 2. 布置任务
        executorService.submit(new FileCopyRunnable(filepath, topath));

        // 3. 关闭线程池
        executorService.shutdown();
    }


}
