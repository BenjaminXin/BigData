package com.lagou.phase01.module03.code.task01;

public class IntegerTest {

    public static void main(String[] args) {

        // 1. 输出Integer 类中常用的常量数值
        System.out.println("max: " + Integer.MAX_VALUE);
        System.out.println("min: " + Integer.MIN_VALUE);
        System.out.println("二进制位数：" + Integer.SIZE);
        System.out.println("字节空间个数：" + Integer.BYTES);
        System.out.println("int类的Class实例: " + Integer.TYPE);

        System.out.println("----------");
        // 2. 使用构造方法，构造Integer类的实例化对象
//        Integer it1 = new Integer(123);
        // 装箱： int -> Integer
        Integer it1 = Integer.valueOf(123);
        System.out.println("it1: " + it1);  // 自动调用 toString 方法

//        Integer it2 = new Integer("456");
        Integer it2 = Integer.valueOf("456");
        System.out.println("it2: " + it2);  // 自动调用 toString 方法

        // 拆箱：Integer -> int
        int ia = it2.intValue();
        System.out.println("ia: " + ia);    // 直接打印 int 类型的数据

        System.out.println("----------");
        // 3. java5 开始，自动装箱，拆箱
        Integer it3 = 100;  // 直接通过赋值运算符，实现自动装箱
        int ib = it3;   // 直接通过赋值运算符,实现自动拆箱

        System.out.println("----------");
        // 4. 拆箱 装箱的笔试考点
//        Integer it4 = 128;
//        Integer it5 = 128;
        Integer it4 = 127;
        Integer it5 = 127;
        Integer it6 = new Integer(128);
        Integer it7 = new Integer(128);

        System.out.println(it4 == it5);         // 比较地址
        System.out.println(it4.equals(it5));    // 比较内容
        System.out.println(it6 == it7);
        System.out.println(it6.equals(it7));

        System.out.println("---------");
        // 5. 其他静态方法调用
        int ic = Integer.parseInt("200");
        System.out.println("String -> int: " + ic);

        System.out.println("int -> String: " + Integer.toString(200));
        System.out.println("int -> String: (2) " + Integer.toBinaryString(200));
        System.out.println("int -> String: (16) " + Integer.toHexString(200));
        System.out.println("int -> String: (8) " + Integer.toOctalString(200));

    }
}
