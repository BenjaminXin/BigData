package com.lagou.phase01.module04.code.task2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatTest {

    public static void main(String[] args) {

        BufferedReader br = null;
        PrintStream ps = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("/Users/benjamin/test/chat.txt"));

            //  声明一个 boolean 变量，用于区别发送方
            boolean flag = true;
            while (true) {
                // 0. 提示用户输入
                System.out.println("请" + (flag? "this" : "that") + "输入聊天内容： ");
                //  从 System.in 读取数据，但是 System.in 是 InputStream 类型
                //  但是 BufferedReader的构造方法需要的 Reader 类型
                //  java 提供了 InputStreamReader 类型，用于类型转换

                String str = br.readLine();
                if ("bye".equals(str)) {
                    System.out.println("chat is over...");
                    break;
                }
                //  将用户输入的内容写入文件
                //else {
                //    ps.println(str);
                //}
                // 获取当前系统时间
                Date d1 = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                ps.println(sdf.format(d1) + (flag? " this: " : " that: ") + str);

                flag = !flag;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭对象
            if (ps != null) {
                ps.close();
            }

            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
