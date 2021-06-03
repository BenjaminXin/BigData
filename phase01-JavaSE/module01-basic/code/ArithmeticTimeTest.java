/*
 * 秒数拆分，应用算数运算符
 */

import java.util.Scanner;


public class ArithmeticTimeTest {

	public static void main(String[] args) {

		// 1. 提示用户输入正整数的秒数
		System.out.println("请输入一个正整数的秒数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// 2. 正整数秒数拆分
		// 如，3666秒 -> 1小时1分6秒
		int hour = num / 3600;
		int minute = (num % 3600) / 60;
		int second = num % 60;
		System.out.println(hour + "小时" + minute + "分" + second + "秒");

		System.out.println("----------");
		// 其两边的操作数中，有一个操作数是字符串类型，则是字符串连接符，否则为加法运算符
		System.out.println(hour + minute + second);
		System.out.println(hour + minute + " " + second);
		System.out.println(" " + (hour + minute + second));
	}
}
