/*
 * 输出1 - 100 之间的奇数
 */



public class ForOddsTest {

	public static void main(String[] args) {

		// 方法1
		for(int i = 1; i <= 100; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();

		
		// 方法2
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();

		// 方法3
		for(int i = 1; i <= 50; i++ ) {
			System.out.print((2 * i - 1) + ", ");
		}
		System.out.println();
	}
}
