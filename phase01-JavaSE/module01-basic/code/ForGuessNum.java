/*
 * for guess number
 */

import java.util.Random;
import java.util.Scanner;


public class ForGuessNum {

	public static void main(String[] args) {

		// 1. 随机生成数字
		Random random = new Random();
		int num = random.nextInt(100) + 1;	// 对100取余(0 ~ 99), 所以需要加1
		//System.out.println(num);
		// 统计用户猜测次数
		int count = 0;
		for(;;) {
			// 2. 用户输入猜数字
			System.out.println("输入数字( 1 - 100): ");
			Scanner scanner = new Scanner(System.in);
			int guess_num = scanner.nextInt();
			count++;
			// 3. 反馈信息给用户
			if(guess_num > num) {
				System.out.println("猜大了");
			} else if(guess_num < num) {
				System.out.println("猜小了");
			} else {
				System.out.println("猜对了");
				break;
			}
			// 
		}

		if(count == 1) {
			System.out.println(count + " times, dope!");
		} else if(count < 6) {
			System.out.println(count + " times, not bad!");
		} else {
			System.out.println(count + " times, emmm...");
		}
	}
}
