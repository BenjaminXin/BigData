package com.lagou.phase01.module02.homework.exercise03;

public abstract class CardPackage {

    private double monthCredit;

    CardPackage () {}

    CardPackage (double monthCredit) {
        setMonthCredit(monthCredit);
    }

    public double getMonthCredit() {
        return monthCredit;
    }

    public void setMonthCredit(double monthCredit) {
        this.monthCredit = monthCredit;
    }

    public abstract void info();
}
