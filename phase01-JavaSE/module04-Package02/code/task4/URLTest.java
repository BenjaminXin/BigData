package com.lagou.phase01.module04.code.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) {

        try {
            // 1. 指定字符串构造对象
            URL url = new URL("https://www.lagou.com/");

            // 2. 获取相关信息，打印
            System.out.println("协议名称： " + url.getProtocol());
            System.out.println("主机名： " + url.getHost());
            System.out.println("端口号： " + url.getPort());

            // 3. 建立连接，读取相关信息
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();

            //断开连接
            urlConnection.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
