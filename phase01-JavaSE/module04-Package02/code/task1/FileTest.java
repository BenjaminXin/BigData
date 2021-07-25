package com.lagou.phase01.module04.code.task1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    public static void show(File filepath) {
        File[] files = filepath.listFiles();
        for (File file : files) {
            String filename = file.getName();
            if (file.isFile()) {
                System.out.println(filename);
            }

            if (file.isDirectory()) {
                System.out.println("[ " + filename + " ]");
                show(file);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. 构造file类型的对象
        File f1 = new File("/Users/benjamin/test/text.txt");

        // 2. 若文件存在，则获取文件的相关特征信息，打印后，删除文件
        if (f1.exists()) {
            System.out.println("file name: " + f1.getName());
            System.out.println("file size: " + f1.length());
            Date d1 = new Date(f1.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //System.out.println("file last modify time: " + sdf.format(d1));
            System.out.println("file last modify time: " + d1);
            System.out.println("file absolute path: " + f1.getAbsolutePath());
            System.out.println(f1.delete()? "file deleted" : "file deleting failed...");
        } else {
            // 3. 若文件不存在，则创建新文件
            System.out.println(f1.createNewFile()? "file created" : "file creating failed...");
        }

        System.out.println("----------");
        // 4. 目录的删除和创建
        File f2 = new File("/Users/benjamin/test/testdelete/this1/this2");
        if (f2.exists()) {
            System.out.println("dir: " + f2.getName());
            System.out.println(f2.delete()? "dir is deleted" : "dir deleting failed...");
        } else {
            System.out.println(f2.mkdirs()? "dir is made" : "dir making failed...");
        }

        System.out.println("----------");
        // 5. 目录的遍历
        File f3 = new File("/Users/benjamin/test/bak");
        File[] files = f3.listFiles();
        for (File file : files) {
            String filename = file.getName();
            if (file.isFile()) {
                System.out.println(filename);
            }

            if (file.isDirectory()) {
                System.out.println("[ " + filename + " ]");
            }
        }

        System.out.println("----------");
        // 6. 有筛选器的 目录遍历
        // 匿名内部类格式：接口/父类类型 引用变量名 = new 接口/父类类型() {方法重写}
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        };

        // lambda 表达式格式， 参数列表 -> 方法体
        FileFilter fileFilter1 = (File pathname) -> {return pathname.getName().endsWith(".py");};

        //
        File f4 = new File("/Users/benjamin/test");
        File[] files1 = f4.listFiles(fileFilter1);
        for (File file : files1) {
            System.out.println(file);
        }

        System.out.println("----------");
        // 7. 只输出当前目录和其子目录, 递归
        show(new File("/Users/benjamin/test/"));
    }
}
