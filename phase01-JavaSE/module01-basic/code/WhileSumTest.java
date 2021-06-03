/*
 * while 计算调和数列的累加和
 */

import java.util.Scanner;


public class WhileSumTest {

	public static void main(String[] args) {
		
		// 1. 输入num
		System.out.println("输入n：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// 2. 累加和
		double sum = 0.0;
		int i = 1;
		while(i <= num) {
			sum += (1.0 / i);
			i++;
		}

		// 3. 输出
		System.out.println("sum = " + sum);
	}
}
