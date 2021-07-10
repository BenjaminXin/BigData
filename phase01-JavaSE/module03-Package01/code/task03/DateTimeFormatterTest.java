package com.lagou.phase01.module03.code.task03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {

    public static void main(String[] args) {

        // 1. 获取当前系统日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);

        // 2. 获取对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");

        // 3. 日期时间 > 字符串
        String str = dateTimeFormatter.format(now);

        // 4. 字符串 -> 日期时间
        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println("parse: " + parse);
    }
}
