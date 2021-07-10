package com.lagou.phase01.module03.code.task03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 1. 获取Calendar 类型的引用
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 5, 28, 20, 35, 05);
        // 2. Calendar -> Date
        Date d1 = calendar.getTime();
        System.out.println("d2: " + sdf.format(d1));

        System.out.println("----------");
        // 3. 向指定的字段，设置指定的值
        calendar.set(Calendar.YEAR, 2020);
        //  转换为Date，输出
        Date d2 = calendar.getTime();
        System.out.println("d2: " + sdf.format(d2));

        // 4. 向指定字段，增加值
        calendar.add(Calendar.MONTH, 1);
        Date d3 = calendar.getTime();
        System.out.println("d3: " + sdf.format(d3));
    }
}
