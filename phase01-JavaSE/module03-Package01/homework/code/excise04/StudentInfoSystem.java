package com.lagou.phase01.module03.homework.excise04;

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

    // 增
    public boolean addToSys() {
        System.out.println("请输入：学号 姓名 年龄");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        String name = scanner.next();
        int age = scanner.nextInt();
        boolean b1 = students.add(new Student(id, name, age));
        if (b1 == false) {
            System.out.println("该学生信息已存在");
        } else {
            System.out.println("添加信息成功");
        }
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
