package com.lagou.phase01.module03.code.task04;

import java.net.Socket;

public class Test {

    public static void main(String[] args) throws Exception{

        Socket s = null;
        s = new Socket("127.0.0.1", 8888);
//        s = new Socket("localhost", 8888);
        System.out.println("succeed");
    }
}
