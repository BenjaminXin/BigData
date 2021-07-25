package com.lagou.phase01.module04.homework.excise01;

public class StuInfoSysTest {

    public static void main(String[] args) throws Exception {
    //public static void main(String[] args) {

        // 1. 获取实例化对象
        StudentInfoSystem studentInfoSystem = StudentInfoSystem.getInstance();

        // 2. 菜单
        studentInfoSystem.menu();
    }
}
