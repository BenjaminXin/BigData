package com.lagou.phase01.module03.code.task04;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // 1. 一个Collection集合
        //  接口类型引用，指向实现类的对象，形成多态
        Collection c1 = new ArrayList();
        System.out.println("c1: " + c1);

        // 2. 向集合中添加单个元素
        boolean b1 = c1.add(new String("one"));
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);
        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        b1 = c1.add(new Person("Benjamin", 25));
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        // 3. 向集合中添加多个元素
        Collection c2 = new ArrayList();
        c2.add("three");    // 常量池
        c2.add(4);          // 自动装箱机制
        System.out.println("c2: " + c2);
        //  将c2中的元素添加到集合1中
        b1 = c1.addAll(c2);
//        b1 = c1.add(c2);      // c2 整体作为元素，添加到c1集合中
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 4. 判断集合中是否包含参数指定的某个元素
//        b1 = c1.contains("one");
        b1 = c1.contains("two");
        System.out.println("b1: " + b1);

        b1 = c1.contains(new Person("Benjamin", 25));
        System.out.println("b1: " + b1);

        System.out.println("----------");
        // 5. 判断当前集合中是否包含参数指定集合的所有元素
        Collection c3 = new ArrayList();
        c3.add(4);
        System.out.println("c3: " + c3);

        b1 = c1.containsAll(c3);
        System.out.println("b1: " + b1);

        c3.add("five");
        System.out.println("c3: " + c3);

        b1 = c1.containsAll(c3);
        System.out.println("b1: " + b1);

        // 笔试考点
        System.out.println("c2: " + c2);
        b1 = c1.contains(c2);
        System.out.println("b1: " + b1);
        // return false, 因为上面代码中，往 c1里导入 c2 时，是逐个元素导入，不是整体导入

        System.out.println("----------");
        // 6. 保留两个集合交集的元素
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        b1 = c2.retainAll(c2);
        System.out.println("b1: " + b1);    // return false，即，集合内容没有改变

        b1 = c2.retainAll(c3);
        System.out.println("b1: " + b1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        System.out.println("---------");
        // 7. 删除单个元素
        b1 = c1.remove(1);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        b1 = c1.remove("one");
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        b1 = c1.remove(new Person("Benjamin", 25));
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 8. 删除所有元素
        System.out.println("c3: " + c3);
        b1 = c1.removeAll(c3);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        System.out.println("----------");
        // 9.清空元素
        c1.clear();
        System.out.println("c1: " + c1);
        System.out.println(c1.size() == 0 ? "Collection is empty" : "not yet");
        System.out.println(c1.isEmpty() ? "Collection is empty" : "not yet");

        System.out.println("----------");
        // 10. 判断两个集合是否相等
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        Collection c5 = new ArrayList();
        c5.add(1);
        c5.add(2);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        b1 = c4.equals(c5);
        System.out.println("b1: " + b1);

        System.out.println("----------");
        // 11. 集合 -> 数组
        c5.add("this");
        Object[] objects = c5.toArray();
        System.out.println("objects: " + Arrays.toString(objects));

//        List objects1 = Arrays.asList(objects);
        Collection objects1 = Arrays.asList(objects);
        System.out.println("objects1: " + objects1);

        System.out.println("----------");
        // 12. 运用迭代器输出集合内的元素
        c5.add(c3);
        c5.add(new Person("tom", 20));
        c4.addAll(c3);
        System.out.println("c5: " + c5);
        System.out.println("c4: " + c4);

        // 使用迭代器遍历元素，输出
        Iterator iterator = c5.iterator();
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 使用迭代器，实现 toString() 方法
        // 重置迭代器
        iterator = c5.iterator();
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        while (iterator.hasNext()) {
            // 当获取到最后一个元素时，末尾拼接 "]"
            // 其余元素，末尾拼接 "， "
            Object obj = iterator.next();
            if (!iterator.hasNext()) {
                sb1.append(obj).append("]");
            } else {
                sb1.append(obj).append(", ");
            }
        }
        System.out.println("sb1: " + sb1);

        System.out.println("----------");
        // 13. 遍历元素，当元素值为 "this" 时, 删除
        iterator = c5.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
//            if ("this".equals(obj)) {
            if ("this" == obj) {
                System.out.println(obj.getClass());
                iterator.remove();
            }
        }
        System.out.println("c5: " + c5);

        System.out.println("----------");
        // 14. for each
        for (Object obj : c5) {
            System.out.println(obj);
        }

        System.out.println("----------");
        // 15. ArrayList
        List lt1 = new ArrayList();
        lt1.add("one");
        System.out.println("lt1: " + lt1);

        System.out.println("----------");
        // 16. LinkedList
        List lt2 = new LinkedList();
        lt2.add("one");
        System.out.println("lt2: " + lt2);



//        System.out.println("----------");
//        // test
//        int a = 10;
//        int b = a >> 1;
//        System.out.println(String.format("a, b: %d, %d", a, b));

    }
}
