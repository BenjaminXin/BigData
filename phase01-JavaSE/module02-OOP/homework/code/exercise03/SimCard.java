package com.lagou.phase01.module02.homework.exercise03;

import java.util.regex.Pattern;

/**
 *  手机卡类
 */
public class SimCard {

    private String type;        // 卡类型
    private String number;      // 卡号
    private String user;        // 用户名
    private String pwd;         // 密码
    private double balance;     // 账户余额
    private int callTime;       // 通话时长（分钟）
    private double netData;   // 上网流量

    SimCard () {}

    SimCard(String type, String number, String user, String pwd, double balance, int callTime, double netData) {
        this.type = type;
        this.number = number;
        this.user = user;
        this.pwd = pwd;
        this.balance = balance;
        this.callTime = callTime;
        this.netData = netData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isNumberic(number)) {
            this.number = number;
        } else {
            System.out.println("phone number has something wrong...");
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /*
    public String getPwd() {
        return pwd;
    }
     */

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        if (callTime > 0) {
            this.callTime = callTime;
        } else {
            System.out.println("callTime can't be negative");
        }
    }

    public double getNetData() {
        return netData;
    }

    public void setNetData(double netData) {
        if (netData > 0) {
            this.netData = netData;
        } else {
            System.out.println("netData can't be negative");
        }
    }

    // 成员方法：显示手机卡信息
    public void info() {
        System.out.println("number: " + getNumber());
        System.out.println("user: " + getUser());
        System.out.println("balance: " + getBalance());
    }

    // 判断字符串是否为数字
    private static boolean isNumberic(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

}
