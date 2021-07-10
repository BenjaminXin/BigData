package com.lagou.phase01.module03.code.task05;

public class Person<T> {

    private String name;
    private int age;
    private T gender;

    public Person() {}

    public Person(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    // 自定义泛型方法, 指定参数数组的类型，并输出数组中的元素
    public<T1> void printArray(T1[] arr) {
        for (T1 tt: arr) {
            System.out.println("item: " + tt);
        }
    }

}
