/*
 * for循环，累加 1 ～ 10000
 */




public class ForSumTest {

	public static void main(String[] args) {

		// for 循环，累加
		int sum = 0;
		for(int i = 1; i <= 10000; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
