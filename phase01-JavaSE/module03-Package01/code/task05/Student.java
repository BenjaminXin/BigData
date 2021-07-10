package com.lagou.phase01.module03.code.task05;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
//        return 0; // 调用对象和参数对象相等时，返回0
//        return -1;  // 调用对象 小于 参数对象
//        return 1;   // 调用对象 大于 参数对象
//        if (this.getAge() - o.getAge() == 0) {
//            return this.getName().compareTo(o.getName());
//        }
//        return this.getAge() - o.getAge();

        // 如果年龄相同，则判断名字
        int ia = this.getAge() - o.getAge();
        return ia != 0? ia : this.getName().compareTo(o.getName());

//        if (this.getName() == o.getName()) {
//            return this.getName().compareTo(o.getName());
//        }
//        return this.getAge() - o.getAge();

        // 如果名字相同，则判断年龄
//        int ib = this.getName().compareTo(o.getName());
//        return ib != 0? ib : this.getAge() - o.getAge();


    }
}
