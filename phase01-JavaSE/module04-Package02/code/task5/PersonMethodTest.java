package com.lagou.phase01.module04.code.task5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest {

    public static void main(String[] args) throws Exception {

        // 1. 反射机制构造对象

        //  获取Class对象
        Class c1 = Class.forName("com.lagou.phase01.module04.code.task5.Person");
        //  根据对象获取对象的有参构造方法
        Constructor constructor = c1.getConstructor(String.class, int.class);
        //  使用有参构造方法 和 构造对象
        Object object = constructor.newInstance("benjamin", 20);
        //  根据Class对象来获取对应的成员方法
        Method method = c1.getMethod("getName");
        //  使用对象调用成员方法进行打印
        //  表示使用object对象，调用method对象表示的方法，即调用getName方法，获得其返回值
        System.out.println("调用方法的返回值： " + method.invoke(object));

        System.out.println("----------");
        // 2. 获取对象中所有成员方法
        Method[] methods = c1.getMethods();
        for (Method mt : methods) {
            System.out.println("成员方法的访问修饰符： " + mt.getModifiers());
            System.out.println("成员方法的返回值类型：" + mt.getReturnType());
            System.out.println("成员方法的名称： " + mt.getName());
            System.out.println("成名方法的形参列表：");
            Class<?>[] parameterTypes = mt.getParameterTypes();
            for (Class ct : parameterTypes) {
                System.out.println(ct + " ");
            }
            System.out.println("成员方法的异常类型列表： ");
            Class<?>[] exceptionTypes = mt.getExceptionTypes();
            for (Class ct : exceptionTypes) {
                System.out.println(ct + " ");
            }
            System.out.println();
            System.out.println("----------");
        }

    }
}
