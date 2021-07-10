package com.lagou.phase01.module03.code.task05;

public class SubPersonTest {

    public static void main(String[] args) {
        // 1. 实例化 SubPerson 类的对象，并调用 set 方法
//    SubPerson<String> sp1 = new SubPerson();  // error，SubPerson类不支持范型
//        SubPerson sp1 = new SubPerson();
//        sp1.setGender("female");
//
//        System.out.println("----------");
//        // 2.
//        SubPerson<Boolean> sp2 = new SubPerson<>();
//        sp2.setGender(false);


        SubPerson<Boolean, String> sp3 = new SubPerson<>();
        sp3.setGender(false);
    }

}
