/*
 * if elseif else 输出考试成绩对应的等级
 */

import java.util.Scanner;


public class IfRankTest {

	public static void main(String[] args) {

		// 1. 输入考试成绩
		System.out.println("成绩： ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		// 2. 判断
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}
}

