package com.lagou.phase01.module04.code.task1;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = null;
        try {
            p1 = new Person("Benjamin", 200);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println("p1: " + p1);
    }
}
