/*
 * 模块一作业
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ModuleOneHomework {

    public static void main(String[] args) {
        System.out.println("          模块一作业          ");
        System.out.println("----------------------------");
        System.out.println("输入序号，选择题目运行:         ");
        System.out.println("[1] 计算第几天     [2] 计算完数");
        System.out.println("[3] 生成双色球号码  [4] 数组扩容");
        System.out.println("[5] 绘制棋盘");
        System.out.println("[0] 退出  其他：重新选择");

        Scanner scanner = new Scanner(System.in);

        int quit = 1;
        while (quit != 0) {
            System.out.println("----------");
            System.out.println("请输入序号, 选择题目: ");
            int flag = scanner.nextInt();
            switch (flag) {
                case 1: dayOfYear(); break;     // 1. 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
                case 2: perfectNumber(); break; // 2. 编程找出 1000 以内的所有完数并打印出来
                case 3: luckyBall(); break;     // 3. 双色球抽奖游戏中奖号码的生成，
                case 4: arrayExpend(); break;   // 4. 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍
                case 5: checkerBoard(); break;  // 5. 使用双重循环实现五子棋游戏棋盘的绘制
                case 0: quit = 0; break;
                default: break;
            }
        }


        //luckyBall();

        // 4. 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍
        //arrayExpend();

        // 5. 使用双重循环实现五子棋游戏棋盘的绘制
        //checkerBoard();
    }

    private static void checkerBoard() {
        System.out.println("5. 绘制五子棋棋盘");
        // 5-1. 声明 棋盘编号的数组，赋值
        String[] titles = new String[16];
        for (int i = 0; i <= 9; i++) {
            titles[i] = Integer.toString(i);
        }
        String[] title_temp = {"a", "b", "c", "d", "e", "f"};
        for (int i = 10; i < 16; i++) {
            titles[i] = title_temp[i - 10];
        }
        //System.out.println("titles: " + Arrays.toString(titles));

        // 5-2. 声明棋盘中棋子的棋位的数组，以 "+" 表示
        String[][] points = new String[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                points[i][j] = "+";
            }
        }
        // 5-3. 打印输出，注意(0, 0)位置的空格
        System.out.print("  ");
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if (i == 0 && j != 0) {
                    System.out.print(titles[j-1] + " ");
                } else if (j == 0 && i != 0) {
                    System.out.print(titles[i-1] + " ");
                } else if (i != 0 && j != 0){
                    System.out.print(points[i-1][j-1] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void arrayExpend() {
        System.out.println("4. 扩容数组");
        // 4-1. 提示输入数组大小
        System.out.println("请输入数组大小：");
        Scanner scanner = new Scanner(System.in);
		int num = 1;
		for(;;) {
			num = scanner.nextInt();
			if(num <= 0) {
				System.out.println("不合理的数组大小，重新输入:");
				continue;
			} else {
				break;
			}
		}
        // 4-2. 声明局部变量，arr - 数组名称，count - 数组下标， temp - 每次输入的字符串
        int[] arr = new int[num];
        int count = 0;
        String temp = "";

        // 4-3. 输入数组元素，循环输入，直到用户输入'q'时，停止输入，并输出数组内容
        while (!("q".equals(temp))) {
            System.out.print("请输入第 " + (count+1) + " 个整数 (输入 q 退出): ");
            temp = scanner.next();
            //  判断用户输入的是字符串还是数字, 是数字，则添加到数组；否，则提示重新输入
            if (isNumeric(temp)) {
                arr[count] = Integer.parseInt(temp);
                count++;
            } else if (!("q".equals(temp))){
                System.out.println("无法识别输入的数字，请重新输入");
            }
            //  注意扩容时，乘以 0.8 后会变成double类型，需要转换成int类型
            //  注意计算容量时，应该向上取整
            if (count >= (int)Math.ceil(num * 0.8)) {
                System.out.println("数组扩容中...");
                num = (int)Math.ceil(num * 1.5);    // 更新数组容量
                int[] arr_temp = new int[num];      // 声明新数组，长度为扩容后的长度
                System.out.println("扩容后的数组容量为：" + arr_temp.length);
                for (int i = 0; i < arr.length; i++) {  //  拷贝原数组数据到扩容后的新数组
                    arr_temp[i] = arr[i];
                }
                arr = arr_temp;     //  原数组名指向新数组
                System.out.println("当前数组内容: " + Arrays.toString(arr));
            }
        }
        System.out.println("数组内容为：" + Arrays.toString(arr));
    }

    // 检查输入的字符串是否是数字, 包含负数
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("-?[0-9]*");
        return pattern.matcher(str).matches();
    }


    private static void luckyBall() {
        /*
        3. 双色球抽奖游戏中奖号码的生成，
            中奖号码由 6 个红球号码和 1 个蓝球号码组成。
            红球号码要求随机生成 6 个 1~33 之间不重复的随机号码
            蓝球号码要求随机生成 1 个 1~16 之间的随机号码
        */
        System.out.println("3. 生成双色球号码");
        // 1. 声明红球数组和蓝球数组
        int[] red  = new int[6];
        int[] blue = new int[1];

        // 2. 随机生成 1 - 33 之间的数字，记录到红球数组中，若数字已经存在，则重新生成随机数
        int temp = 0;   // 指向每次循环生成的随机数
        Random random = new Random();
        // 循环生成随机数，直到红球数组里不存在 0 值
        while (Arrays.binarySearch(red, 0) >= 0) {
            temp = random.nextInt(33) + 1;
            // 当生成的随机数和红球数组里已有的数字不重复时，将此随机数添加到红球数组中的第一个位置
            if (!(Arrays.binarySearch(red, temp) >= 0)) {
                red[0] = temp;
            }
            // 每次添加数字之后排序，空出第一个位置，也为了满足binarySearch()的排序条件
            Arrays.sort(red);
        }

        // 3. 蓝球数组
        blue[0] = random.nextInt(16) + 1;

        // 打印输出
        System.out.println("中奖号码，红球：" + Arrays.toString(red) + "；蓝球：" + Arrays.toString(blue));
    }

    private static void perfectNumber() {
        System.out.println("2. 输出正整数1000以内的完数");
        int i = 2;
        int j = 1;
        int sum = 0;
        //  遍历 2 - 1000
        for (i = 2; i <= 1000; i++) {
            sum = 0;
            //  依次对 1 - 其(本身-1) 的数取余，判断是否是真因子
            //  若是真因子，则累加
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            //  当其真因子累加和 与 其本身的数值相等时, 输出
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 第二种方法：欧拉完数公式
        // p 质数；(2^p-1) 质数；-> (2^p-1) * 2^(p-1) = 完数
        // 遍历 2 - sqrt(1000), 找到所有p
        // 时间复杂度高，暂时不写
    }

    private static void dayOfYear() {
        System.out.println("1. 判断指定日期是其年份中的第几天");
        // 1. 提示用户输入年月日，计算这个日期是这一年中的第几天
        // 1-1 变量
        int year = 0;
        int month = 0;
        int day = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean flag = false;   // 记录是否为闰年

        Scanner scanner = new Scanner(System.in);

        // 1-2 输入日期，并检查日期是否合理
        for(;;) {
            // 输入日期
            System.out.println("请输入日期：(如，年 月 日 - 2021 06 22)，输入负数则退出: ");
            year = scanner.nextInt();
            if (year < 0) {
                break;
            }
            month = scanner.nextInt();
            day = scanner.nextInt();
            // 判断是否为润年
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag) {
                days[1] = 29;
            } else {
                days[1] = 28;
            }
            // 检查输入的日期是否合理
            // 检查year
            if (year == 0 || year < 0) {
                System.out.println("非合理日期，重新输入");
                continue;
            }
            // 检查month
            if (month > 12 || month <= 0) {
                System.out.println("非合理日期，重新输入");
                continue;
            }
            // 检查day
            if (day > days[month - 1] || month <= 0) {
                System.out.println("非合理日期，重新输入");
                continue;   //
            }
            // 如果获取到合理的日期，则退出输入循环
            if (year != 0 && month != 0 && day != 0) {
                break;
            }
        }
        if (year > 0) {
            System.out.println("日期： " + year + " " + month + " " + day);

            // 1-3 累计天数，输出
            for (int i = 0; i < month - 1; i++) {
                day += days[i];
            }
            System.out.println("该日期是 " + year + " 年中的第 " + day + " 天");
        }
    }
}
