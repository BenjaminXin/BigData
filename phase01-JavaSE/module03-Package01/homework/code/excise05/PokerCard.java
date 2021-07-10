package com.lagou.phase01.module03.homework.excise05;

public class PokerCard {

    // 扑克牌属性：花色、数值
    private String color;
    private String name;
    private int number;

    public PokerCard () {}

    public PokerCard(String color, String name, int number) {
        this.color = color;
        this.name = name;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
//        return "PokerCard{" +
//                "color='" + color + '\'' +
//                ", name=" + name +
//                ", number=" + number +
//                '}';

        return "{" +
                color +
                ", " + name +
                '}';
    }
}
