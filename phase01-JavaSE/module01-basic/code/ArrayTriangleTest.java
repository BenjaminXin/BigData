/*
 * 杨辉三角
 */

import java.util.Scanner;


public class ArrayTriangleTest {

	public static void main(String[] args) {

		// 1. 输入行数
		System.out.println("输入行数: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// 2. 声明一个变长的二维数组
		int[][] arr = new int[num][];
		
		// 3. 初始化数组
		for(int i = 0; i < num; i++) {
			// 对每一行的一维数组，进行内存申请
			arr[i] = new int[i+1];
			// 构造杨辉三角
			for(int j = 0; j <= i; j++) {
				if((j == 0) || (i == j)) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}

			}
		}

		// 4. 输出
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
