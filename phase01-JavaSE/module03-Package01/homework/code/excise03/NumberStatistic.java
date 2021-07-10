package com.lagou.phase01.module03.homework.excise03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberStatistic {

    public static void main(String[] args) {

        // 1. 字符串
        String s = "123,456,789,123,456";

        // 2. HashMap 集合
        Map<Character, Integer> m1 = new HashMap<>();

        // 3. String -> char[]
        char[] c = s.toCharArray();

        // 4. 遍历 char[], 将元素添加入 HashMap
        for (char i : c) {
            Integer t = m1.put(i, 1);
            if (t != null) {
                m1.remove(i);
                m1.put(i, ++t);
            }
        }
        m1.remove(',');

        // 5. 输出
        Set<Map.Entry<Character, Integer>> entries = m1.entrySet();
        for (Map.Entry<Character, Integer> i : entries) {
            System.out.println(i);
        }
    }
}
