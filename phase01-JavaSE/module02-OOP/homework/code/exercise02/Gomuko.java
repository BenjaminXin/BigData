package com.lagou.phase01.module02.homework.exercise02;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;

/**
 * 五子棋类
 *
 * 成员变量:
 * 1. x, y - 坐标
 * 2. rows, cols - 棋盘规格
 * 3. boards - 棋盘数组，存储棋局(包含黑白双方落子位置和回合数)
 * 4. strBoards - 存储棋局格式化后的符号，用于输出
 * 5. botSide - 机器方，黑方 或者 白方
 *
 * 成员方法：
 * 1. takeSide() - 选择机器是黑/白方
 * 2. setBoards() - 构建棋盘
 * 3. placing() - 落子入盘
 * 4. check() - 判断棋局
 * 5. autoPlacing() - 机器落子, (没有简易的思路暂时不写)
 * 6. printBoards() - 输出棋盘
 *
 * 7. testkit() - 测试方法
 */
public class Gomuko {

    private int x;          // 落子坐标x
    private int y;          // 落子坐标y
    private int rows;       // 棋盘行数
    private int cols;       // 棋盘列数
    private int[][] boards; // 棋盘数组
    private String[][] strBoards; // 棋盘格式化
    private int botSide;       // 机器方，黑方 或者 白方

    // 构造函数，初始化棋盘大小，默认为 16 * 16
    Gomuko() {
        setRows(16);
        setCols(16);
        setBoards();
        setStrBoards();
    }

    Gomuko(int rows, int cols) {
        setRows(rows);
        setCols(cols);
        setBoards();
        setStrBoards();
    }

//    public int getX () {
//        return x;
//    }

    public void setX (int x) {
        this.x = x;
    }

//    public int getY () {
//        return y;
//    }

    public void setY (int y) {
        this.y = y;
    }

//    public int getRows () {
//        return rows;
//    }

    public void setRows (int rows) {
        if (rows > 5) {
            this.rows = rows;
        } else {
            System.out.println("rows of the board is illegal!");
        }
    }

//    public int getCols () {
//        return cols;
//    }

    public void setCols (int cols) {
        if (cols > 5) {
            this.cols = cols;
        } else {
            System.out.println("cols of the board is illegal!");
        }
    }

//    public int[][] getBoards () {
//        return boards;
//    }

    /**
     * 初始化棋盘数组
     */
    public void setBoards () {
        boards = new int[this.rows][this.cols];
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                boards[i][j] = 0;
            }
        }
    }

    /**
     * 初始化 棋盘格式化数组
     * @return
     */
    public String[][] getStrBoards () {
        return strBoards;
    }

    private void setStrBoards () {
        this.strBoards = new String[this.rows + 1][this.cols + 1];

        strBoards[0][0] = " ";
        // 标题索引为 0 - f
        String[] xstickList = new String[this.rows + 1];
        String[] ystickList = new String[this.cols + 1];
        for (int i = 1; i < xstickList.length; i++) {
            if (i <= 10) {
                xstickList[i] =  Integer.toString(i - 1);
                strBoards[i][0] =  Integer.toString(i - 1);
            } else {
                xstickList[i] = String.valueOf((char) (i - 1 + 87));
                strBoards[i][0] = String.valueOf((char) (i - 1 + 87));
            }
        }

        for (int i = 1; i < ystickList.length; i++) {
            if (i <= 10) {
                ystickList[i] = Integer.toString(i - 1);
                strBoards[0][i] = Integer.toString(i - 1);
            } else {
                ystickList[i] = String.valueOf((char) (i - 1 + 87));
                strBoards[0][i] = String.valueOf((char) (i - 1 + 87));
            }
        }

        // 除标题索引外，初始化为 "+"
        for (int i = 1; i < strBoards.length; i++) {
            for (int j = 1; j < strBoards[0].length; j++) {
                strBoards[i][j] = "+";
            }
        }
    }

    public int getBotSide () {
        return botSide;
    }

    /**
     * 程序选择黑方/白方
     * 无参调用
     * 生成机器方，返回人工方
     * return 0 或 1，表示 黑方 或 白方
     * @return
     */
    public int takeSide () {
        int[] flagList = new int[] {-1, 1};
        Random random = new Random();
        int i = random.nextInt(2);
        this.botSide = flagList[i];
        return (flagList[1 - i]);
    }

    /**
     * 用户选择黑方/白方
     * 传入人工方，设置机器方
     * 有参调用，如果参数值不是 0 或 1，则return -1
     * @param side, 黑方 1， 白方 0
     * @return
     */
    public int takeSide (int side) {
        if (side == 1) {
            this.botSide = -1;
            return side;
        } else if (side == -1) {
            this.botSide = 1;
            return side;
        } else {
            return -1;
        }
    }

    /**
     * 输入落子到棋盘数组, 并判断是否连续五子
     * @param x 行
     * @param y 列
     * @param side 黑方/白方标志位
     * @param count 回合数
     */
    public int placing (int x, int y, int side, int count) {
        if (boards[x][y] == 0) {
            if (side == 1) {
                boards[x][y] = count;
            } else {
                boards[x][y] = -count;
            }
            return isWon(x, y, side);
        } else {
            System.out.println("该位置已经被占用");
            return -1;
        }
    }



    public int isWon(int row, int col, int side) {
        int count = 1;      //本身一点为 1
        int posCol = 0;
        int posRow = 0;

        /**
         * 行方向
         * 先向左边遍历，判断到的相同的连续的点  count++
         */
        if (boards[row][col] != 0) {
            System.out.println("----------");
            for (posCol = col - 1; posCol >= 0 ; posCol--) {
                if (boards[row][posCol] * side > 0 ) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }

            //向右边遍历
            for (posCol = col + 1; posCol <= boards[0].length - 1; posCol++) {
                if (boards[row][posCol] * side > 0) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }

            /**
             * 列方向
             * 先向上遍历，判断到的相同的连续的点  count++
             */
            for (posRow = row - 1; posRow >= 0; posRow--) {
                if (boards[posRow][col] * side > 0) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }

            //向下遍历
            for (posRow = row + 1; posRow <= boards.length - 1; posRow++) {
                if (boards[posRow][col] * side > 0) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }

            /**
             * 主对角线方向
             * 先判断左边的
             */
            for (posCol = col - 1, posRow = row - 1; posCol >= 0 && posRow >= 0; posCol--, posRow--) {
                if (boards[posRow][posCol] * side > 0) {
                    count++;
                    if (count >= 5) {
                        count = 1;
                        return 1;
                    }
                } else {
                    break;
                }
            }

            //判断右边的
            for (posCol = col + 1, posRow = row + 1; posCol <= boards[0].length - 1 && posRow <= boards.length - 1; posCol++, posRow++) {
                if (boards[posRow][posCol] * side > 0) {
                    count++;
                    if (count >= 5) {
                        count = 1;
                        return 1;
                    }
                } else {
                    break;
                }
            }

            /**
             * 副对角线方向
             * 先判断左边的
             */
            for (posCol = col - 1, posRow = row + 1; posCol >= 0 && posRow <= boards.length - 1; posCol--, posRow++) {
                if (boards[posRow][posCol] * side > 0) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }

            //判断右边的
            for (posCol = col + 1, posRow = row - 1; posCol <= boards[0].length - 1 && posRow >= 0; posCol++, posRow--) {
                if (boards[posRow][posCol] * side > 0) {
                    count++;
                    if (count >= 5) {
                        return 1;
                    }
                } else {
                    break;
                }
            }
            return 0;
        } else {
            return -2;
        }
    }

    /**
     * 输出棋盘
     */
    public void printBoards () {
        // 根据 boards 棋盘数组的内容，格式化 strBoards
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[0].length; j++) {
                int item = boards[i][j];
                if (item == 0) {
                } else if (item > 0) {
                    strBoards[i+1][j+1] = "O";
                } else {
                    strBoards[i+1][j+1] = "X";
                }
            }
        }

        // 输出棋盘
//        for (int[] items : boards) {
//            for (int item : items) {
        for (String[] items : strBoards) {
            for (String item : items) {
//                System.out.print(item + " ");
                System.out.print(String.format("%3s", item));
            }
            System.out.println();
        }
    }


    /*
    // autoPlacing() - 机器落子
    // 预判对方的预判，同一套预测落子位置的方法
    public void autoPlacing (int[] info, int botSide) {

    }
     */

    // check() - 判断棋局
//    public int[] check() {
//        // 存储判断棋局结果：info[botside_num, humanside_num, possible_positions both_side, ...]
//        int[] info = new int[4];
//
//        // 逻辑
//        for (int i = 0; i < boards.length; i++) {
//            for (int j = 0; j < boards[0].length; j++) {
//                int center = boards[i][j];
//                if (center != 0) {
//                    // 遍历当前中心点周围的的8个棋位的棋子状况
//                    // 递归遍历，判断棋子连续
//                    for (int ii = i-1; ii < i+2; ii++) {
//                        for (int jj = j-1; jj < j+2; jj++) {
//                            if ((ii < 0 || jj < 0) || (ii > boards.length-1 || jj > boards[0].length-1)) {
//                                continue;
//                            }
//                            System.out.println("i: " + i + " ,j: " + j + "; ii: " + ii + " ,jj: " + jj);
//                        }
//                    }
//                }
//                System.out.println("----------");
//            }
//        }
//        return info;
//    }


}
