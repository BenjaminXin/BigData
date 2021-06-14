/*
 * Fibonacci
 */

public class FibonacciTest {

	// 递归计算, 返回第 n 项 斐波那契数列的数值
	int show(int n) {
		
		// 1. 递归计算
		if (n == 1 || n == 2) {
			return 1;
		}

		// 否则，返回前两项的和
		return show(n-1) + show(n-2);
	}

	// 递推计算
	int generate(int n) {

		// 1. 递推计算
		int ia = 1;
		int ib = 1;
		
		if(n == 1 || n == 2) {
			return 1;
		}
		
		for(int i = 3; i <= n; i++) {
			int ic = ia + ib;
			ia = ib;
			ib = ic;
		}
		return ib;
	}




	public static void main(String[] args) {
	

		// 实例化对象
		FibonacciTest ft = new FibonacciTest();
		int res = ft.show(5);
		System.out.println("result = " + res);

		System.out.println("----------");
		res = ft.generate(55);
		System.out.println("result = " + res);
	}


}


