package com.lagou.phase01.module04.homework.excise01;

public class Student implements java.io.Serializable {

    private static final long serialVersionUID = 950128L;

    private String id;
    private String name;
    private int age;

    public Student() {}

    public Student(String id, String name, int age) {
        setId(id);
        setAge(age);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (isNumeric(id)) {
            this.id = id;
        } else {
            try {
                throw new IdException("id is illegal...");
            } catch (IdException e) {
                e.printStackTrace();
            }
        }
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
        if (age > 0 && age <= 70) {
            this.age = age;
        } else {
            try {
                throw new AgeException("age is out of range!");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hashcode=" + this.hashCode() +
                '}';
    }

    private boolean isNumeric(String str) {
        int chr = 0;
        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            if (chr < 48 || chr > 57) {
                return false;
            }
        }
        return true;
    }
}
