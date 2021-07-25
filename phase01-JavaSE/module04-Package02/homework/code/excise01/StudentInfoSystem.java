package com.lagou.phase01.module04.homework.excise01;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentInfoSystem {

    private static List<Student> students = new LinkedList<>();

    public List<Student> getStudents () {
        return students;
    }

    // 单例模式
    // 2. 私有化实例化对象
    private static StudentInfoSystem stuInfoSys = new StudentInfoSystem();
    // 1. 私有化构造方法
    private StudentInfoSystem () {}

    // 3. 公开获取实例化对象方法
    public static StudentInfoSystem getInstance() {
        return stuInfoSys;
    }

    // 字符界面
    public void menu() {

        // 从文件中读取学生信息
        students = input();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("学生信息管理系统：");
            System.out.println("[1] 添加");
            System.out.println("[2] 删除");
            System.out.println("[3] 查询");
            System.out.println("[4] 遍历");
            System.out.println("[0] 退出");
            System.out.println("请输入号码进行选择: ");

            int i = scanner.nextInt();
            if (i == 0) {
                output(students);
                break;
            }
            switch (i) {
                case 1:
                    addToSys();
                    break;
                case 2:
                    removeFromSys();
                    break;
                case 3:
                    findStu();
                    break;
                case 4:
                    printAll();
                    break;
                default:
                    System.out.println("请重新输入");
            }
        }

    }

    // 将学生信息数据写入文件
    public void output(List<Student> students) {
        ObjectOutputStream oos = null;
        try {
            // 创建对象
            oos = new ObjectOutputStream(new FileOutputStream("/Users/benjamin/test/studata.txt"));
            // 写入
            oos.writeObject(students);
            System.out.println("输出序列化完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 从文件中加载数据
    public List<Student> input() {
        List<Student> students = null;

        ObjectInputStream ois = null;
        try {
            // 对象
            ois = new ObjectInputStream(new FileInputStream("/Users/benjamin/test/studata.txt"));
            // 读取数据
            Object object = ois.readObject();
            students = (List<Student>) object;
            System.out.println("读取到的数据：" + students);
            System.out.println("读取完成");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return students;
    }

    // 增
    public boolean addToSys() {
        System.out.println("请输入：学号 姓名 年龄");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String name = scanner.next();
        int age = scanner.nextInt();
        Student student = new Student(id, name, age);
        boolean b1 = true;
        if (student.getId() != null && student.getAge() != 0) {
            b1 = students.add(student);
            if (b1 == false) {
                System.out.println("学生信息添加失败，请重试");
            } else {
                System.out.println("添加信息成功");
            }
        } else {
            System.out.println("学生信息有误，请重新输入");
        }
        //boolean b1 = students.add(new Student(id, name, age));

        return b1;
    }

    // 删
    public void removeFromSys() {
        System.out.println("请输入：学号 姓名 年龄");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String name = scanner.next();
        int age = scanner.nextInt();

        int count = 0;
        for (Student s : students) {
            // 遍历查找学生信息，与用户输入的信息匹配后删除
            if (id.equals(s.getId()) && name.equals(s.getName()) && age == s.getAge()) {
                students.remove(s);
                System.out.println("学生信息：" + s + " 已删除");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("没有该学生信息");
        }
    }

    // 查
    public void findStu() {

        // 根据学号或者姓名查找
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入编号，选择以哪种方查找学生信息");
            System.out.println("[1] 根据学号查找");
            System.out.println("[2] 根据姓名查找");
            System.out.println("[0] 返回上一级菜单");
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            switch (i) {
                case 1:
                    System.out.println("请输入学号：");
                    break;
                case 2:
                    System.out.println("请输入姓名");
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }

            String key = scanner.next();
            // 根据 学号 查询
            if (i == 1) {
                int count = 0;
                for (Student s : students) {
                    if (key.equals(s.getId())) {
                        System.out.println(s.toString());
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("此学生信息不存在");
                }
                //  根据 姓名 查询
            } else if (i == 2) {
                int count = 0;
                for (Student s : students) {
                    if (key.equals(s.getName())) {
                        System.out.println(s.toString());
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("此学生信息不存在");
                }
            }
        }
    }

    // 遍历
    public void printAll() {
        System.out.println(students.toString());
    }
}
