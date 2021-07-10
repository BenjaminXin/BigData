package com.lagou.phase01.module03.code.task01;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {

        // 1. 构造两个对象
        BigInteger bi1 = new BigInteger("20");
        BigInteger bi2 = new BigInteger("8");

        // 2. 方法
        System.out.println("multiply: " + bi1.add(bi2));
        System.out.println("subtract: " + bi1.subtract(bi2));
        System.out.println("multiply: " + bi1.multiply(bi2));
        System.out.println("divide: " + bi1.divide(bi2));
        System.out.println("mod: " + bi1.remainder(bi2));

        BigInteger[] arrs = bi1.divideAndRemainder(bi2);
        for (BigInteger arr: arrs) {
            System.out.println(arr);
        }

    }
}
