package com.lagou.phase01.module02.homework.exercise01;

import java.util.Arrays;

public class AyyaySum {

    public static void main(String[] args) {

        // 1. 定义一个 16 * 16 的二维数组，指定所有位置的元素值
        int[][] array = new int[16][16];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i * array[0].length + j + 1;
            }
        }
        System.out.println("初始数组: ");
        showArray(array);

        // 2. 所有行、列上的元素分别累加和
        int[] rowsResult = new int[array.length];
        int[] colsResult = new int[array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                rowsResult[i] += array[i][j];
            }
        }
        System.out.println("各行元素累加和: \n" + Arrays.toString(rowsResult));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                colsResult[i] += array[j][i];
            }
        }
        System.out.println("各列元素累加和: \n" + Arrays.toString(colsResult));

        // 3. 主、副对角线元素的累加和
        int diagonal = 0;
        int counterDiagonal = 0;

        System.out.print("主对角线元素累加和: \nsum[");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + ", ");   // 输出主对角线上的元素
                    diagonal += array[i][j];
                }
            }
        }
        System.out.println("] = " + diagonal);


        System.out.print("副对角线元素累加和: \nsum[");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) == array.length - 1) {
                    System.out.print(array[i][j] + ", ");   // 输出副对角线上的元素
                    counterDiagonal += array[i][j];
                }
            }
        }
        System.out.println("] = " + counterDiagonal);

    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(String.format("%3s ", array[i][j]));
            }
            System.out.println();
        }
    }
}
