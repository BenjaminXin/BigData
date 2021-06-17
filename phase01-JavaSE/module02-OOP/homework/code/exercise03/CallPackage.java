package com.lagou.phase01.module02.homework.exercise03;

/**
 *  通话套餐类
 */
public class CallPackage extends CardPackage implements CallService{

    private int callTime;
    private int messageNum;

    CallPackage () {}

    CallPackage (int callTime, int messageNum, double monthCredit) {
        super(monthCredit);
        setCallTime(callTime);
        setMessageNum(messageNum);
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

    public int getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(int messageNum) {
        if (messageNum > 0) {
            this.messageNum = messageNum;
        } else {
            System.out.println("messageNum can't be negative");
        }
    }

    // 成员方法：显示所有套餐信息
    @Override
    public void info() {
        System.out.println("call time: " + getCallTime());
        System.out.println("message number: " + getMessageNum());
        System.out.println("monthly credit: " + getMonthCredit());
    }

    @Override
    public void callService(int callTime, SimCard sc) {
        System.out.println("call service is working...");
    }
}
