/*
 * 移位运算符
 */



public class MoveBitTest {

	public static void main(String[] args) {

		// 1. 声明byte类型的变量
		byte b1 = 13;
		System.out.println("b1 = " + b1);

		System.out.println("----------");
		// 2. 移位运算符
		//  13 的二进制是 0000 1101, 左移后，是0001 1010，超出byte的大小
		//  换算成十进制 是 26, 即，左移一位，通常是原数值的两倍
		//byte b2 = b1 << 1;	// int > byte 类型不兼容
		byte b2 = (byte)(b1 << 1);
		System.out.println("b2 = " + b2);
		System.out.println(b1 << 1);

		System.out.println("----------");
		// 3. 右移
		//  13 右移后，是 0000 0110 = 十进制 6 
		System.out.println(b1 >> 1);
		System.out.println(b1 >> 2);

		// 4. 无符号逻辑右移，对于非负数来说，结果和右移一样
	}
}
