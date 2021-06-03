/*
 * Narcissistic number
 */


public class ForNarNumber{

	public static void main(String[] args) {

		// 所有的3位数
		for(int i = 100; i<= 999; i++) {
			int num = i % 10;
			int dec = i % 100 / 10;
			int hundred = i / 100;
			//System.out.println("the number is " + hundred + dec + num);
			if(i == (hundred * hundred * hundred + dec * dec * dec +num * num * num)) {
				System.out.println(i);
			}
		}
	}
}
