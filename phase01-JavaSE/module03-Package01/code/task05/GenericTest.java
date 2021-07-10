package com.lagou.phase01.module03.code.task05;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        // 1. 声明两个List类型的集合
        List<Animal> lt1 = new LinkedList<>();
        List<Dog> lt2 = new LinkedList<>();

        // 2. 通配符作为泛型类型的公共父类
        List<?> lt3 = new LinkedList<>();
        lt3 = lt1;  // List<Animal> => List<?> is fine
        lt3 = lt2;  // List<Dog> => List<?> is fine

        // 向公共父类中添加元素和获取元素
        //lt3.add(new Animal());  // error: 不能存放Animal类型的对象
        //lt3.add(new Dog());     // error: 不能存放Dog类型的对象
        // 无限通配符，可以传入所有类型，导致不能添加元素，因为添加后，不能保证泛型类型的一致
        // 所以，不支持元素的添加操作

        // 支持元素的获取
//        Object obj = lt3.get(0);

        System.out.println("----------");
        // 3. 有限制通配符
        List<? extends Animal> lt4 = new LinkedList<>();
//        lt4.add(new Animal());
//        lt4.add(new Dog());
        Animal animal = lt4.get(0);

        System.out.println("----------");
        // 4. 有限制通配符
        List<? super Animal> lt5 = new LinkedList<>();
        lt5.add(new Animal());
        lt5.add(new Dog());
//        lt5.add(new Object());


    }
}
