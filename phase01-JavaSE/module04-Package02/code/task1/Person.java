package com.lagou.phase01.module04.code.task1;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws AgeException {
        setAge(age);
        setName(name);
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

    public void setAge(int age) throws AgeException {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
//            System.out.println("something wrong with age...");
            throw new AgeException("age is out of range");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
