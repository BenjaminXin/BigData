/*
 * if分支结构
 */

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		// 1. 提示用户输入年龄信息
		System.out.println("请输入年龄:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		// 2. if分支结构
		if (age >= 18) {
			System.out.println("可以使用");
		}

		System.out.println("last words");
	}
}
