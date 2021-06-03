/*
 * 关系运算符实现负数判断
 */

import java.util.Scanner;


public class RelationJudgeTest {

	public static void main(String[] args) {

		// 1. 提示用户输入一个整数
		System.out.println("请输入一个整数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// 2. 判断是否为负数，并打印输出
		System.out.println(num < 0);
	}
}
