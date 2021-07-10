package com.lagou.phase01.module03.code.task01;

import java.util.Objects;

public class Student {

    private int id;     // 学号
    private String name;    // 姓名

    public Student () {}

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("id is out of range...");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

   /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

     */

/*

    // 重写 equals 方法, 为了比较对象的内容
    // Student this = s1;
    // Object obj = s1;     // 多态，父类类型无法直接使用子类的方法，需要强制转换
    @Override
    public boolean equals (Object obj) {
//        // 当调用对象不为空，但是参数对象为空时，则返回false
//        if (obj == null) { return false;}
//        // 当调用对象和参数对象指向同一个对象时，内容一定相同
//        if (obj == this) {return true;}
//        // 判断obj是否为Student类型的对象
//        if (obj instanceof Student) {
//            Student ts = (Student) obj;
//            return this.getId() == ts.getId();
//        }
//        // 否则，类型不一致，没有可比性，内容一定不相同
//        return false;

        // 以name 做为判断依据, String类型的引用变量存放的是地址，用 == 判断的是地址是否相同
        // 而不是内容是否相同，应该用String.equals
        // 当调用对象不为空，但是参数对象为空时，则返回false
        if (obj == null) { return false;}
        // 当调用对象和参数对象指向同一个对象时，内容一定相同
        if (obj == this) {return true;}
        // 判断obj是否为Student类型的对象
        if (obj instanceof Student) {
            Student ts = (Student) obj;
            return this.getName().equals(ts.getName());
        }
        // 否则，类型不一致，没有可比性，内容一定不相同
        return false;
    }

     */

    /**
     * 重写hashCode方法，使其结果与重写的equals方法一致，满足java官方的常规协定
     */
    /*
    @Override
    public int hashCode () {
//        return getId();   // 返回的不是内存地址
        int type = 12;
        // return type * 31 + getId();
        return getName().hashCode();
    }
    */

    /**
     * 重写 toString方法，打印更有意义的调用对象的字符串形式
     */
    /*
    @Override
    public String toString () {
//        return "Student[id: " + getId() + ", name: " + getName() + "]";
        return this.getClass() + "[id: " + getId() + ", name: " + getName() + "]";
    }

    */

}

