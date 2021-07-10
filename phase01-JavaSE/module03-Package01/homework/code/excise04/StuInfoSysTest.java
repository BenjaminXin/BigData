package com.lagou.phase01.module03.homework.excise04;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class StuInfoSysTest {

    public static void main(String[] args) throws Exception {

        // 1. 获取实例化对象
        StudentInfoSystem studentInfoSystem = StudentInfoSystem.getInstance();

        // 2. 菜单
        studentInfoSystem.menu();
    }
}
