/*
 * 双重for循环
 */




public class ForForTest {

	public static void main(String[] args) {
		
		// 1. 循环打印输出5行
		for(int i = 1; i <= 5; i++) {
			System.out.println("this is the line");
		}

		System.out.println("----------");
		// 2. 循环输出5列
		for(int j = 1; j <= 5; j++) {
			System.out.print("this is the column");
		}
		System.out.println();

		System.out.println("----------");
		// 3. 双循环输出5行5列
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("this is the word. ");
			}
			System.out.println();
		}
	}
}
