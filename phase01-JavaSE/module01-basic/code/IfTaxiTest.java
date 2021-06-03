/*
 * if elseif else, 出租车计费
 */

import java.util.Scanner;


public class IfTaxiTest {

	public static void main(String[] args) {

		// 1. 输入里程和等待秒数
		System.out.println("输入里程和等待秒数:");
		Scanner scanner = new Scanner(System.in);
		int km = scanner.nextInt();
		int sec = scanner.nextInt();

		// 2. 判断，计算
		int kmprice = 0;
		if(km <= 3) {
			kmprice = 13;
		} 
		else if(km <= 15) {
			kmprice = 13 + (km - 3) * 2; 
		} 
		else {
			kmprice = 13 + (15 - 3) * 2 + (km - 15) * 3; 
		}
		
		int secprice = sec / 150;

		// 3. 输出
		System.out.println("price = " + (kmprice + secprice));
		
	}
}
