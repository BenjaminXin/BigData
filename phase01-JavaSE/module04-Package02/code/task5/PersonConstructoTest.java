package com.lagou.phase01.module04.code.task5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class PersonConstructoTest {

    public static void main(String[] args) throws Exception {

        // 1. 原始方式，无参形式构造Person类型的对象并打印
        Person p1 = new Person();
        System.out.println("无参方式创建的对象： " + p1);

        // 2. 使用反射机制，无参方式构造对象

        // 创建对象的类型，可以从配置文件中读取
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/benjamin/test/a.txt")));
        String str1 = br.readLine();
        Class c1 = Class.forName(str1);
        System.out.println("反射机制，无参方式创建的对象: " + c1.newInstance());

        // 获取Class对象对应类中的无参构造方法
        Constructor constructor = c1.getConstructor();
        // 获取无参构造方法，来构造对应类型的对象
        System.out.println("获取构造方法，创建对象： " + constructor.newInstance());
        br.close();


        // 有参方式构造对象
        Person p2 = new Person("benjamin", 20);
        System.out.println("有参方式构造的对象： " + p2);

        System.out.println("----------");
        // 4. 使用反射机制，以有参方式构造对象
        //  获取Class 对象对应类中的有参构造方法
        Constructor constructor2 = c1.getConstructor(String.class, int.class);
        System.out.println("反射机制，获取有参构造方法，创建对象： " + constructor2.newInstance("tom", 20));

        System.out.println("----------");
        // 获取Class对象中所有的构造方法
        Constructor[] constructors = c1.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("构造方法的修饰符：" + c.getModifiers());
            System.out.println("构造方法的方法名称： " + c.getName());
            Class[] parameterTypes = c.getParameterTypes();
            for (Class cs : parameterTypes) {
                System.out.println(cs);
            }
            System.out.println("----------");
        }

    }
}
