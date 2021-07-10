package com.lagou.phase01.module03.code.task04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        // 1. 实例化 Queue 集合对象
        Queue queue = new LinkedList();
        System.out.println("queue: " + queue);

        System.out.println("----------");
        // 2. 入队列
        queue.offer("this");
        queue.offer("is");
        queue.offer("Benjamin");

        // 3. 查看队首元素
        System.out.println(queue.peek());

        // 4. 所有元素出队列
        int len = queue.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("poll element: " + queue.poll());
        }
        System.out.println("queue: " + queue);
    }
}
