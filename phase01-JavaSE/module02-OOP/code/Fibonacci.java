/*
 * Fibonacci 数列
 */

import java.util.Arrays;


public class Fibonacci {

	//int[] generator(int n) {
	int generator(int n) {
		int[] result  = new int[n];
		if (n == 0 || n == 1) {
			//return new int[] {0};
			return 0;
		}
	
		result[0] = 0;
		result[1] = 1;
	
		if (n == 2) {
			return result[1];
		}
		
		return result[n - 1] = generator(n - 2) + generator(n - 3);
	}

	void show(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	void show(int array) {
		System.out.println(array);
	}


	int[] test(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = i + 1;
		}

		return result;
	}


	public static void main(String[] args) {
		
		// 1. 测试show() 方法
		Fibonacci f1 = new Fibonacci();
		f1.show(f1.test(5));

		System.out.println("----------");
		f1.show(f1.generator(0));
		
		System.out.println("----------");
		f1.show(f1.generator(1));
		
		System.out.println("----------");
		f1.show(f1.generator(5));


	}
}
