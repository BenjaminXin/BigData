package com.lagou.phase01.module03.code.task03;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {

    public static void main(String[] args) {

        // 1. 使用Instant 类获取当前时间
        Instant now = Instant.now();
        System.out.println("now: " + now);

        System.out.println("----------");
        // 2. 补上时区偏移量
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("offset now: " + offsetDateTime);

        System.out.println("----------");
        // 3. 获取当前时间的时间戳
        long g1 = now.toEpochMilli();
        System.out.println("g1: " + g1);

        // 4. 根据时间戳，构造对象
        Instant now2 = Instant.ofEpochMilli(g1);
        System.out.println("now2: " + now2);

    }
}
