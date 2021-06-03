/*
 * while
 */



public class WhileTest {

	public static void main(String[] args) {
		// 1. for 循环输出 1 - 10
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		// 2. while 循环输出 1 - 10
		System.out.println("----------");
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
	}
}
