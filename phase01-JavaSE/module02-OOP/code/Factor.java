/*
 * 阶乘
 */


public class Factor {

	// 阶乘
	// 0! = 1, 1! = 1, 2! = 2, 3! = 6
	int show(int n) {
		if (n == 0) {
			return 1;
		}
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	int recursion(int n) {
		if (n == 0) {
			return 1;
		}

		return n * recursion(n - 1);
	}

	public static void main(String[] args) {
		Factor factor = new Factor();
		int res = factor.show(5);
		System.out.println("result = " + res);

		res = factor.show(0);
		System.out.println("result = " + res);

		System.out.println("----------");
		res = factor.recursion(5);
		System.out.println("result = " + res);

		System.out.println("----------");
		res = factor.recursion(0);
		System.out.println("result = " + res);


	}
}
