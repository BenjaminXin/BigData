package com.lagou.phase01.module03.homework.excise01;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordStatistic {

    public static void main(String[] args) {

        // 1. 字符串
        String  s = "ABCD123!@#$%ab";
        System.out.println("原字符串: " + s);

        System.out.println("----------");
        // 2. 统计 大写字母、小写字母、数字、其他字符
        //  大写字母
        String sUpper = "";
        String pattern = "([A-Z]+)";
        Matcher matcher = Pattern.compile(pattern).matcher(s);

        while (matcher.find()) {
            sUpper += matcher.group();
        }
        System.out.println("大写字符有: " + sUpper);

        //  小写字母
        String sLower = "";
        pattern = "([a-z]+)";
        Matcher matcher1 = Pattern.compile(pattern).matcher(s);

        while (matcher1.find()) {
            sLower += matcher1.group();
        }
        System.out.println("小写字符有: " + sLower);

        //  数字
        String sNum = "";
        pattern = "([0-9]+)";
        Matcher matcher2 = Pattern.compile(pattern).matcher(s);

        while (matcher2.find()) {
            sNum += matcher2.group();
        }
        System.out.println("数字字符有: " + sNum);

        //  其他字符
        String sOther = "";

        //  拼接除开"其他字符"的字符
        String sAll = sUpper.concat(sLower);
        sAll = sAll.concat(sNum);
//        System.out.println("sAll: " + sAll);

        char[] sAllList = sAll.toCharArray();

        //  将原字符串中，除开"其他字符"的字符，替换为"A"
        sOther = s;
        for (char i : sAllList) {
            sOther = sOther.replace(i, 'A');
        }
//        System.out.println("sOther: " + sOther);

        //  统计"其他字符"的数量
        char[] sOtherList = sOther.toCharArray();
        int numOther = 0;
        for (char i : sOtherList) {
            if (i != 'A') {
                numOther++;
            }
        }

        System.out.println("----------");
        // 3. 输出结果
        System.out.println("大写字母个数: " + sUpper.length());
        System.out.println("小写字母个数: " + sLower.length());
        System.out.println("数字个数: " + sNum.length());
        System.out.println("其他字符个数: " + numOther);
    }
}
