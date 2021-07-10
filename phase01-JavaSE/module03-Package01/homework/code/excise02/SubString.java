package com.lagou.phase01.module03.homework.excise02;


public class SubString {

    public static void main(String[] args) {
        String s1 = "asdafghjka";
        String s2 = "aaasdfg";
        String s = getSonString(s1, s2);
        System.out.println(s);
    }

    private static String getSonString(String s1, String s2) {
        String max = null;
        String min = null;
        String temp="";
        if (s1.length() > s2.length()) {
            max = s1;
            min = s2;
        }else {
            max = s2;
            min = s1;
        }
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j <= i; j++) {
                //从小的字符串开始，从左向右移位比较
                String substring = min.substring(j, min.length() - i + j);
                if (max.contains(substring)) {
                    if(temp.length() < substring.length()) {
                        temp = substring;
                    }
                }
            }
        }
        return temp;
    }
}
