package com.lagou.phase01.module03.code.task03;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws Exception{

        // 1. 构造对象
        Date d1 = new Date();
        System.out.println("d1: " + d1);
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        System.out.println("sdf1: " + sdf1.format(d1));
        // 2. 指定日期格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("sdf2: " + sdf2.format(d1));

        System.out.println("-----------");
        // 3. Date -> String, String -> Date
        String format = sdf2.format(d1);
        System.out.println("date String: " + format);
        Date d2 = sdf2.parse(format);
        System.out.println("d2: " + d2);


    }
}
