package com.lagou.phase01.module04.homework.excise02;

import java.io.File;
import java.util.Scanner;

public class DictionariesRemove {

    public static void remove(File filepath) {
        File[] files = filepath.listFiles();
        for (File file : files) {
            String filename = file.getName();
            if (file.isFile()) {
                System.out.print(filename);
                if (file.exists()) {
                    System.out.println(file.delete()? " deleted" : " delete failed...");
                }
            }

            if (file.isDirectory()) {
                System.out.print("[ " + filename + " ]");
                remove(file);
                if (file.exists()) {
                    System.out.println(file.delete()? " dir is deleted" : " dir delete failed...");
                }
            }
        }
    }

    public static void main(String[] args) {

        // 输入路径
        System.out.println("请输入要清空的目录路径: ");
        Scanner scanner = new Scanner(System.in);
        String filepath = scanner.next();
        System.out.println(filepath);

        remove(new File(filepath));
    }
}
