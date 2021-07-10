package com.lagou.phase01.module03.code.task01;

public class BooleanTest {

    public static void main(String[] args) {

        // 1. java5 之前，手动拆箱，装箱
        Boolean bo1 = Boolean.valueOf(true);
        System.out.println("bo1: " + bo1);

        boolean b1 = bo1;
        System.out.println("b1: " + b1);

        // 2. java5 之后，自动拆箱装箱
        Boolean bo2 = true;
        boolean b2 = bo2;
        System.out.println("bo2: " + bo2);
        System.out.println("b2: " + b2);

        System.out.println(Boolean.parseBoolean(bo1.toString()));

        System.out.println("parseBoolean 方法，参数非 \"true\", 则皆为false");
        System.out.println(Boolean.parseBoolean("123"));


    }
}
