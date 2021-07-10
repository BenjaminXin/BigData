package com.lagou.phase01.module03.code.task03;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        // 1. 构造Date对象
        Date d1 = new Date();
        System.out.println("d1: " + d1);

        System.out.println("----------");
        // 2. 指定时间戳，构造对象
        Date d2 = new Date(1000);
        System.out.println("d2: " + d2);
        System.out.println(d2.getTime());
        System.out.println(d1.getTime());

        System.out.println("----------");
        // 3. 设定指定时间戳
        d2.setTime(10000);
        System.out.println("d2: " + d2);
    }
}
