package com.lagou.phase01.module03.code.task03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        // 1. 获取当前日期信息
        LocalDate now = LocalDate.now();
        System.out.println("now: " + now);
        // 2. 获取当前时间信息
        LocalTime now1 = LocalTime.now();
        System.out.println("now1: " + now1);
        // 3. 获取当前日期时间信息
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("now2: " + now2);

        System.out.println("----------");
        // 4. LocalDateTime 类 的方法
        LocalDateTime localDateTime = LocalDateTime.of(2021, 5, 28, 22, 2, 20);
        System.out.println("localDateTime: " + localDateTime);
        System.out.println("year: " + localDateTime.getYear());
        System.out.println("month: " + localDateTime.getMonthValue());
        System.out.println("day: " + localDateTime.getDayOfMonth());
        System.out.println("hour: " + localDateTime.getHour());
        System.out.println("minute: " + localDateTime.getMinute());
        System.out.println("second: " + localDateTime.getSecond());

        System.out.println("----------");
        LocalDateTime localDateTime1 = localDateTime.withYear(2020);
        System.out.println("localDateTime1: " + localDateTime1);
        System.out.println("localDateTime: " + localDateTime);
        LocalDateTime localDateTime2 = localDateTime.plusYears(1);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = localDateTime.minusMonths(3);
        System.out.println(localDateTime3);

    }
}
