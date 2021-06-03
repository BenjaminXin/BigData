/*
 * 二维数组
 */

import java.util.Arrays;


public class ArrayArrayTest {

	public static void main(String[] args) {

		// 声明二维数组
		int[][] arr1 = new int[2][3];
		
		// 输出
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------");
		// 2. 初始化
		int[][] arr2 = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
		//System.out.print("arr2: " + Arrays.toString(arr2));
		for(int[] i : arr2) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// 3. 考点
		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[4];
		arr3[2] = new int[5];
		for(int[] i : arr3) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
