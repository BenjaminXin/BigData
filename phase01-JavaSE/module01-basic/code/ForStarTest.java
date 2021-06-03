/*
 * for 打印 * 图案
 */ 



public class ForStarTest {

	public static void main(String[] args) {

		// 1. 打印5行5列 * 号
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 2. 打印左下三角 * 号
		//  j <= i
		System.out.println("----------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 3. 打印左上三角 * 号
		//  i + j = 6
		System.out.println("----------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (6-i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 4. 打印金字塔三角 * 号
		//  j <= 2*i-1
		System.out.println("----------");
		for(int i = 1; i <= 5; i++) {
			// 控制空格数量
			for(int j = 1; j <= (5-i); j++) {
				System.out.print("  ");

			}
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
