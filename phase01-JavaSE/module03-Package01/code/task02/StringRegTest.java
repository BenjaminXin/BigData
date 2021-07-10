package com.lagou.phase01.module03.code.task02;

public class StringRegTest {

    public static void main(String[] args) {

        // 1. 定义正则表达式的字符串
        //  银行卡密码
        String reg = "^\\d{6}$";
        String qqReg = "^[^0]\\d{4,14}$";
        String phoneReg = "^1[34578]\\d{9}$";
        String idReg = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9X])$";

        String testReg = "^[19]+$";
        String s = "19";
        System.out.println(s.matches(testReg));

        // 2. 字符串内容
        //  银行卡密码范例
        String pwd = "123456";
//        String qq = "123456789";
        String qq = "023456789";
//        String phone = "12345678910";
        String phone = "13345678910";

        String idNumber = "34567819990202321X";

        // 3. 判断字符串是否符合规则
        System.out.println(pwd.matches(reg));
        System.out.println(qq.matches(qqReg));
        System.out.println(phone.matches(phoneReg));
        System.out.println(idNumber.matches(idReg));
    }
}
