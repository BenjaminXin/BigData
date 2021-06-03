/*
 * 判断是否为三位数
 */
 
import java.util.Scanner;


public class LogicJudgeTest {

	public static void main(String[] args) {

		// 1. 提示用户输入正整数
		System.out.println("请输入一个正整数: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// 2. 输出判断
		System.out.println(100 <= num && num <= 999);
		// 逻辑运算符，用于连接多个关系运算符符号所组成的表达式

		// 3. 三目运算符
		boolean b1 = 100 <= num && num <= 999;
		System.out.println(b1? "三位数": "不是三位数");
	}
}
