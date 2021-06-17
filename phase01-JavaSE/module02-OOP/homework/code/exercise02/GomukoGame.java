package com.lagou.phase01.module02.homework.exercise02;

import java.util.Scanner;

/**
 * 五子棋游戏
 * 1. 选择黑棋白棋
 *
 * 2. 下棋
 *
 * 3. 判断结果
 */

public class GomukoGame {

    public static void main(String[] args) {

        // 1. 实例化五子棋对象
        Gomuko gomuko = new Gomuko();
        Scanner scanner = new Scanner(System.in);

        System.out.println("棋盘： ");
        gomuko.printBoards();

        int x = 0;
        int y = 0;
        int flag = -1;
        int count = 1;
        int iswon;
        System.out.println("游戏开始，黑方先手，请输入落子的坐标: \n(如，0 2 表示 第 0 行，第 2 列)");
        System.out.println("(1 15 表示 第 1 行，第 f 列)");

        while (true) {
            System.out.println("第 " + (int) Math.ceil(count / 2.0) + " 回合：");
            // 2. 提示用户当前黑方/白方，输入棋子位置
            while (true) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x < 0 || x > 15) {
                    System.out.println("请重新输入：");
                } else if (y < 0 || y > 15) {
                    System.out.println("请重新输入：");
                } else {
                    break;
                }
            }
            System.out.println("x: " + x + ", y: " + y);

            // 3. 输入落子位置、黑/白方、回合数 并且 判断输赢
            iswon = gomuko.placing(x, y, flag, (int) Math.ceil(count / 2.0));
            if (iswon == 1) {
                break;
            } else if (iswon == -1) {
                System.out.println("请重新输入: ");
            } else {
                gomuko.printBoards();
                flag *= -1;
                if (flag == -1) {
                    System.out.println("黑棋落子： ");
                } else {
                    System.out.println("白棋落子： ");
                }
                count++;
            }
        }

        gomuko.printBoards();
        if (flag == -1) {
            System.out.println("黑方胜");
        } else {
            System.out.println("白方胜");
        }
    }
}