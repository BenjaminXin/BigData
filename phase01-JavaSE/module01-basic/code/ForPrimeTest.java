/*
 * 输出 2 - 100 所有的素数
 */



 public class ForPrimeTest {

	public static void main(String[] args) {
/*
		for(int i = 2; i <= 100; i++) {
			// count 记录因子个数
			int count = 0;
			//for(int j = 2; j <= 9; j++) {
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(i + " ");
			}
		}
*/


		for(int i = 2; i <= 100; i++) {
			// flag 作为是否为质数的标记
			boolean flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				// 如果在 2 - (i-1) 之间，存在i的因子, 则为素数
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(i + " ");
			}
		}
	}
 }
