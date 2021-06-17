package com.lagou.phase01.module02.homework.exercise03;

/**
 *  流量套餐类
 */
public class DataPackage extends CardPackage implements InternetService{

    private double netData;

    DataPackage () {}

    DataPackage (double netData, double monthCaredit) {
        super(monthCaredit);
        setNetData(netData);
    }


    public double getNetData() {
        return netData;
    }

    public void setNetData(double netData) {
        if (netData > 0) {
            this.netData = netData;
        } else {
            System.out.println("internet data can't be negative");
        }
    }

    // 成员方法：显示所有套餐信息
    @Override
    public void info () {
        System.out.println("internet data: " + getNetData());
        System.out.println("monthly Credit: " + getMonthCredit());
    }

    @Override
    public void internetService(double netData, SimCard sc) {
        System.out.println("internet service is working...");
    }
}
