/*
 * 数组工具类
 */

import java.util.Arrays;


public class ArrayUtilArrayTest {

	public static void main(String[] args) {

		// 1. 声明，初始化数组
		int[] arr1 = {10, 20, 30, 40, 50};
		
		// 2. 遍历方式打印输出
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("----------");
		// 3. 使用数据工具类打印输出
		System.out.println("data of array: " + Arrays.toString(arr1));
		
		System.out.println("----------");
		// 4. 数据工具类，填充数组
		int[] arr2 = new int[5];
		System.out.println("data of array 2: " + Arrays.toString(arr2));
		//  填充10 
		Arrays.fill(arr2, 10);
		System.out.println("data of array 2: " + Arrays.toString(arr2));
		
		System.out.println("----------");
		// 5. 数据工具类，判断数组是否相等
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 10);
		//   判断数组是否相等
		System.out.println(Arrays.equals(arr2, arr3));

		System.out.println("----------");
		// 6. 数据工具类，查找最低分和最高分
		int[] temp = arr1;
		System.out.println("data of array: " + Arrays.toString(temp));
		Arrays.sort(temp);
		System.out.println("min: " + temp[0] + ", max: " + temp[temp.length-1]);

		System.out.println("----------");
		// 7. 数据工具类，查找指定元素所在位置
		System.out.println("20 is in the index of array: " + Arrays.binarySearch(arr1, 20));
		

		
		

	}
}
