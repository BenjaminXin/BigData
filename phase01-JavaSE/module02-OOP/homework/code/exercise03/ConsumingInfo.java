package com.lagou.phase01.module02.homework.exercise03;

/**
 *  用户消费信息类
 */
public class ConsumingInfo {

    private int sumCallTime;        // 统计通话时长
    private double sumNetData;      // 统计上网流量
    private double monthConsuming;  // 每月消费金额

    ConsumingInfo () {}

    ConsumingInfo (int sumCallTime, double sumNetData, double monthConsuming) {
        setSumCallTime(sumCallTime);
        setSumNetData(sumNetData);
        setMonthConsuming(monthConsuming);
    }

    public int getSumCallTime() {
        return sumCallTime;
    }

    public void setSumCallTime(int sumCallTime) {
        this.sumCallTime = sumCallTime;
    }

    public double getSumNetData() {
        return sumNetData;
    }

    public void setSumNetData(double sumNetData) {
        this.sumNetData = sumNetData;
    }

    public double getMonthConsuming() {
        return monthConsuming;
    }

    public void setMonthConsuming(double monthConsuming) {
        this.monthConsuming = monthConsuming;
    }

}
