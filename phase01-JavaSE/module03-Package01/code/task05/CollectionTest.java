package com.lagou.phase01.module03.code.task05;

import java.net.CookieHandler;
import java.text.CollationElementIterator;
import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // 1. 初始化
        List<Integer> lt1 = Arrays.asList(10, 30, 40, 50, 60);
        // 2. 集合操作
        System.out.println("max: "+ Collections.max(lt1));
        System.out.println("max: "+ Collections.min(lt1));

        // 3. 集合元素反转
        Collections.reverse(lt1);
        System.out.println("lt1: " + lt1);

        // 4. 两个元素交换位置
        Collections.swap(lt1, 2, 4);
        System.out.println("lt1: " + lt1);

        // 5. 排序
        Collections.sort(lt1);
        System.out.println("lt1: " + lt1);

        // 6. 随机打乱
        Collections.shuffle(lt1);
        System.out.println("lt1: " + lt1);

        // 7. 集合元素拷贝
        List<Integer> lt2 = Arrays.asList(new Integer[10]);
        System.out.println("lt1's size: " + lt1.size());
        System.out.println("lt2's size: " + lt2.size());
        Collections.copy(lt2, lt1);
        System.out.println("lt2: " + lt2);



    }
}
