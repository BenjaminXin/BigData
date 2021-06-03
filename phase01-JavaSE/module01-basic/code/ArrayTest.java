/*
 * 数组
 */



public class ArrayTest {

	public static void main(String[] args) {

		// 1. 声明一个数组
		//int arr1[] = new int[2];
		int[] arr1 = new int[2];
		System.out.println("arr1' length = " + arr1.length);

		// 2. 输出所有元素
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("i = " + arr1[i]);
		}
		
		// 3. 另一种遍历方式
		System.out.println("----------");
		for (int i : arr1) {
			System.out.println("i = " + i );
		}

		//4. 声明 并 初试化
		System.out.println("----------");
		char[] arr2 = {'a', 'b', 'c', 'd'};
		for (char i : arr2) {
			System.out.println("i = " + i );
		}

		//5. 特殊的写法
		System.out.println("----------");
		// 数组声明并初始化的完整写法
		boolean[] arr3 = new boolean[]{true, true, false, false};
		for (boolean i : arr3) {
			System.out.println("i = " + i );
		}
		

	}
}
