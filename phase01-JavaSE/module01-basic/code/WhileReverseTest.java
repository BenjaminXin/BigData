/*
 * 方法：对数取余数，对数除10；循环到除 10 得0  
 */

import java.util.Scanner;


public class WhileReverseTest {

	public static void main(String[] args) {

		// 1. 输入正整数
		System.out.println("输入正整数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;

		// 2. 解析正整数，反向输出
		while(temp > 0) {
			System.out.print(temp % 10); // 输出个位数
			temp /= 10;	// 丢弃个位数
		}		
		System.out.println();

		// 3. 另一种输出方法
		int res = 0;
		temp = num;
		while(temp > 0) {
			res = res * 10 + temp % 10;
			temp /= 10;	// 丢弃个位数
		}
		System.out.println("num = " + num + ", res = " + res);
	}
}
