/*
 * if elseif else
 */

import java.util.Scanner;


public class IfElseifElseTest {

	public static void main(String[] args) {

		// 1. 输入身份信息
		System.out.println("输入身份信息:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		// 2. 判断
		if("军人".equals(str)) {
			System.out.println("free to trip");
		} else if("学生".equals(str)) {
			System.out.println("half only");
		} else {
			System.out.println("paid for yourself");
		}

		// 3.
		System.out.println("lase words");
	}
}
