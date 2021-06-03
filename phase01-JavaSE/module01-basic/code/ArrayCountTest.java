/*
 * 统计任意整数中，数字出现的次数
 */

import java.util.Scanner;


public class ArrayCountTest {

	public static void main(String[] args) {

		// 1. 输入正整数
		System.out.println("输入正整数:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// 2. 构造记录数字出现次数的数组, 初试化均为0
		//  下标 0 - 9，分别表示数字 0 - 9，(十进制数，均由0-9的数字组成)
		int[] arr = new int[10];
		for(int i = 0; i <= 9; i++) {
			arr[i] = 0;
		}
		//  输出检查
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. 拆分数字，记录到数组内
		int temp = num;
		while(temp > 0) {
			arr[temp % 10] ++;
			temp /= 10;
		}

		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
