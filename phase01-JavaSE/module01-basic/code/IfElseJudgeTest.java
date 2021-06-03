/*
 * if else 判断是否为负数
 */

import java.util.Scanner;


public class IfElseJudgeTest {

	public static void main(String[] args) {

		// 1. 输入一个整数
		System.out.println("输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// 2. if - else judge
		if(num < 0) {
			System.out.println(num + " negative number");
		} else {
			System.out.println(num + " is not a negative number");
			// 判断是正数还是零
			if (num > 0) {
				System.out.println(num + " positive number");
			} else {
				System.out.println(num + " is ZERO");
			}
		}
	}

}
