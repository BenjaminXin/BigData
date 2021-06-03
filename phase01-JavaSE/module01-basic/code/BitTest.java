/*
 * 位运算符
 */



public class BitTest {

	public static void main(String[] args) {

		// 1. 声明两个byte类型变量，初始化
		byte b1 = 11;
		byte b2 = 13;

		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		System.out.println("----------");
		// 2. 位运算符
		// b1: 11, 二进制：0000 1011
		// b2: 13, 二进制：0000 1101
		System.out.println(b1 & b2);	// 按位与, 0000 1001, 十进制9
		System.out.println(b1 | b2);	// 按位或, 0000 1111, 十进制15
		System.out.println(b1 ^ b2);	// 异或,   0000 0110, 十进制6
		System.out.println(~b1);	
		// 取反,   1111 0100 -> 十进制
		// 先减1: 1111 0011
		// 取反： 0000 1100
		// 十进制：12，添符号：-12
	}
}
