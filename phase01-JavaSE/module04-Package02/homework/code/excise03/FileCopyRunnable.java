package com.lagou.phase01.module04.homework.excise03;

import java.io.*;

public class FileCopyRunnable implements Runnable {

    private String filepath;
    private String topath;

    public FileCopyRunnable() {}

    public FileCopyRunnable(String filepath, String topath) {
        setFilepath(filepath);
        setTopath(topath);
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getTopath() {
        return topath;
    }

    public void setTopath(String topath) {
        this.topath = topath;
    }

    @Override
    public void run() {
        File fileobj = new File(filepath);
        build(fileobj, topath);

    }

    public void build(File fileobj, String newFilePath) {

        File[] files = fileobj.listFiles();
        for (File file : files) {
            System.out.println("---------");
            String filename = file.getName();
            if (file.isFile()) {    // 是文件就拷贝
                System.out.printf("filename: " + filename);
                System.out.println();
                // copy
                System.out.println("file path: " + file.getAbsolutePath());
                String newFilename = newFilePath + "/" + filename;
                System.out.println("new file path: " + newFilename);
                copy(file.getAbsolutePath(), newFilename);
                System.out.println(filename + " is copied");
            }
            if (file.isDirectory()) {   // 是目录就创建
                System.out.printf("dir: " + filename);
                String str = file.getAbsolutePath();
                System.out.println(" [" + str.substring(filepath.length()) + "]");

                newFilePath = topath + str.substring(filepath.length());
                File newFile = new File(newFilePath);
                newFile.mkdirs();
                System.out.println("[" + newFilePath + "]" + " is made");
                build(file, newFilePath);
            }
        }
    }

    public void copy(String filepath, String newFilename) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 1. BufferedInputStream 对象
            bis = new BufferedInputStream(new FileInputStream(filepath));
            // 2. BufferedOutputStream 对象
            bos = new BufferedOutputStream(new FileOutputStream(newFilename));
            // 3. 拷贝
            byte[] bArr = new byte[1024];
            int res = 0;
            while ((res = bis.read()) != -1) {
                bos.write(bArr, 0, res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }

}
