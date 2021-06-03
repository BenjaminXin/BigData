/*
 * 学生成绩统计和输出
 */

import java.util.Scanner;


public class ArrayScoreTest {

	public static void main(String[] args) {

		// 1. 输入学生人数和成绩
		System.out.println("输入学生人数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		//  成绩数组, 变长数组，变量可以作为数组长度，但不是动态数组
		int[] scores = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("输入第 " + (i+1) + " 个学生的成绩：" );
			scores[i] = scanner.nextInt();
		}
		System.out.println();
			

		// 2. 输入学生成绩
		for(int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. 输出全班成绩总分和平均分
		int sum = 0;
		for(int i : scores) {
			sum += i;
		}
		System.out.println("total: " + sum);
		System.out.println("average: " + (sum*1.0 / num));
	}
}
