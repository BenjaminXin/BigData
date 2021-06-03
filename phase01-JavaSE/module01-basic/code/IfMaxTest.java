/*
 * if分支结构，判断最大值
 */

import java.util.Scanner;

public class IfMaxTest {

	public static void main(String[] args) {

		// 1. 提示用户输入两个整数
		System.out.println("输入两个整数：");
		Scanner scanner = new Scanner(System.in);
		int ia = scanner.nextInt();
		int ib = scanner.nextInt();

		// 2. 判断最大值
		/*
		if(ia > ib) {
			System.out.println("Max = " + ia);
		}
		if(ib > ia) {
			System.out.println("Max = " + ib);
		}	
		*/

		// 3. 方法二, 用max变量记录最大值，初始值为ia，遇到更大的数，则替换max的值
		int max = ia;
		if(ib > max) {
			max = ib;
		}
		System.out.println("Max = " + max);
	}
}
