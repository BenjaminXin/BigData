package com.lagou.phase01.module03.code.task01;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {

        // 1. 构造两个对象
        BigDecimal bd1 = new BigDecimal("5.2");
        BigDecimal bd2 = new BigDecimal("1.3");

        // 2. 使用方法
        System.out.println("add: " + bd1.add(bd2));
        System.out.println("subtract: " + bd1.subtract(bd2));
        System.out.println("multiply: " + bd1.multiply(bd2));
        System.out.println("divide: " + bd1.divide(bd2));

        System.out.println("----------");
        // 3. 精确运算
        System.out.println(0.1 + 0.2);
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println("ac: " + bd3.add(bd4));

        System.out.println("----------");
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("3");
        // 无限循环小数，
        System.out.println("divide: " + bd5.divide(bd6, BigDecimal.ROUND_HALF_UP));
    }
}
