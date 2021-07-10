package com.lagou.phase01.module03.code.task05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        // 1. 准备 Map 集合
        Map<String, String> m1 = new HashMap<>();
        System.out.println("m1: " + m1);

        // 2. 添加元素
        String str1 = m1.put("1", "first");
        System.out.println("原来的value: " + str1);
        System.out.println("m1: " + m1);

        str1 = m1.put("2", "second");
        System.out.println("原来的value: " + str1);
        System.out.println("m1: " + m1);

        str1 = m1.put("3", "third");
        System.out.println("原来的value: " + str1);
        System.out.println("m1: " + m1);

        System.out.println("----------");
        // 3. 查找
        boolean b1 = m1.containsKey("sis");
        System.out.println("b1: " + b1);

        b1 = m1.containsKey("1");
        System.out.println("b1: " + b1);

        b1 = m1.containsValue("second");
        System.out.println("b1: " + b1);

        String str2 = m1.get("ts");
        System.out.println("str2: " + str2);

        str2 = m1.get("2");
        System.out.println("str2: " + str2);

        System.out.println("----------");
        // 4. 删除
        str2 = m1.remove("1");
        System.out.println("str2: " + str2);
        System.out.println("m1: " + m1);

        System.out.println("----------");
        // 5. 遍历 key
        Set<String> s1 = m1.keySet();
        for (String ts: s1) {
            System.out.println(ts);
        }

        // 6. 遍历 value
        Collection<String> v1 = m1.values();
        for (String ts : v1) {
            System.out.println(ts);
        }

        // 7. 遍历 键值对
        Set<Map.Entry<String, String>> entries = m1.entrySet();
        for (Map.Entry<String, String> me : entries) {
            System.out.println(me);
        }



    }
}
