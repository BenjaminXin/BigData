package com.lagou.phase01.module03.code.task01;

public class DoubleTest {

    public static void main(String[] args) {

        // 1. java5 之前的装箱，拆箱
        Double db1 = Double.valueOf(3.14);
        System.out.println("db1: " + db1);

        // 拆箱
        double d1 = db1.doubleValue();
        System.out.println("d1: " + d1);

        // 2. java5 自动装箱，拆箱
        Double db2 = 3.14;
        double d2 = db2;
        System.out.println("db2: " + db2 + ", d2: " + d2);

        // 3.
        double d3 = Double.parseDouble("3.14");
        System.out.println("d3: " + d3);

        System.out.println(db2.isNaN());

        Double db3 = Double.valueOf(0 / 0.0);
        System.out.println(db3.isNaN());

    }
}
