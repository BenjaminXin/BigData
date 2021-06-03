/*
 * do while , 模拟学习任务完成是否合格
 */

import java.util.Scanner;


public class DoWhileCheckTest {

	public static void main(String[] args) throws Exception {

		String msg = null;
		//String msg = "";
		do {
			System.out.println("studing...");
			Thread.sleep(2000);
			System.out.println("is it pass? (y/n)");
			Scanner scanner = new Scanner(System.in);
			msg = scanner.next();
		} while(!"y".equals(msg));

		System.out.println("passed!");
	}
}
