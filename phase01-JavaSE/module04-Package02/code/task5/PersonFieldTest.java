package com.lagou.phase01.module04.code.task5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {

    public static void main(String[] args) throws Exception {

        // 1. 创建对象
        Person p1 = new Person("benjamin", 20);
        System.out.println("获取到的成员变量数值为： " + p1.getName());

        System.out.println("----------");
        // 2. 反射机制，构造对象，获取成员变量的值
        Class c1 = Class.forName("com.lagou.phase01.module04.code.task5.Person");
        Constructor constructor = c1.getConstructor(String.class, int.class);
        Object object = constructor.newInstance("tom", 20);
        Field f = c1.getDeclaredField("name");
        System.out.println("获取到的成员变量数值为：" + f.get(object));

        // 3. 修改指定对象中的成员变量
        f.set(object, "clare");
        System.out.println("修改后的成员变量的值： " + f.get(object));

        System.out.println("----------");
        // 4. 获取Class对象中所有的成员变量
        Field[] declareFields =  c1.getDeclaredFields();
        for (Field ft : declareFields) {
            System.out.println("获取到的访问修饰符： " + ft.getModifiers());
            System.out.println("获取到的数据类型：" + ft.getType());
            System.out.println("获取到的成员变量: " + ft.getName());
        }



    }
}
