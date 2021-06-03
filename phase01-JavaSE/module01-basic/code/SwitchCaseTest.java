/*
 * switch case
 */

import java.util.Scanner;


public class SwitchCaseTest {

	public static void main(String[] args) {

		// 1. 输入考试成绩
		System.out.println("输入考试成绩：");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		int index = score / 10;
		switch(index) {
			case 10: System.out.println("A");break;
			case 9: System.out.println("A");break;
			case 8: System.out.println("B");break;
			case 7: System.out.println("C");break;
			case 6: System.out.println("D");break;
			default: System.out.println("E");//break;
		}
	}
}
