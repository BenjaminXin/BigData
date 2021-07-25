package com.lagou.phase01.module04.code.task1;

public class ExceptionTest {

    public static void main(String[] args) throws Exception {

        // 1. 非检测性异常
//        System.out.println(5 / 0);

        // 2. 检测性异常
        Thread.sleep(1000);

        System.out.println("end");
    }
}
