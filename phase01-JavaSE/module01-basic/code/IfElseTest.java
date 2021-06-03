/*
 * if else
 */

import java.util.Scanner;


public class IfElseTest {

	public static void main(String[] args) {

		// 1. 提示输入成绩
		System.out.println("输入考试成绩：");
		Scanner scanner = new Scanner(System.in);
		int score  = scanner.nextInt();

		// 2. 判断成绩是否及格
		if(score >= 60) {
			System.out.println("passed");
		} else {
			System.out.println("try again");
		}

		System.out.println("last words");
	}
}
