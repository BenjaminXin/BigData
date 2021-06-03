/*
 * 三目运算符，输出最大值
 */

import java.util.Scanner;

public class TripleEyeTest {

	public static void main(String[] args) {

		// 1. 提示输入两个整数
		System.out.println("请输入两个整数");
		Scanner scanner = new Scanner(System.in);
		int ia = scanner.nextInt();
		int ib = scanner.nextInt();

		// 2. 输出最大值
		int max = ia > ib? ia: ib;
		System.out.println("max = " + max);
	}
}
