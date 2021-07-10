package com.lagou.phase01.module03.code.task04;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        // 1. 实例化 Stack 类对象
        Stack stack = new Stack();
        stack.push("this");
        stack.push("is");
        stack.push("Benjamin");
        System.out.println("stack: " + stack);

        // 2. 遍历取栈元素
        Object obj = stack.peek();
        System.out.println("obj: " + obj);
        int len = 0;
//        len = stack.size();
//        for (int i = 1; i <= len; i++) {
//            System.out.println("pop element: " + stack.pop());
//        }
//        System.out.println("stack: " + stack);

        System.out.println("----------");
        // 3. 两个栈，栈1取出，推入栈2，再取出
        Stack stack2 = new Stack();

        len = stack.size();
        for (int i = 1; i <= len; i++) {
            Object obj2 = stack.pop();
            stack2.push(obj2);
        }
        System.out.println("stack2: " + stack2);

        System.out.println("----------");
        len = stack2.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("pop element: " + stack2.pop());
        }
        System.out.println("stack2: " + stack2);




    }
}
