/*
 * 基本数据类型之间的转换
 */


public class TransformTest {

	public static void main(String[] args) {

		// 1.声明两个变量，初始化
		byte b1 = 10;
		short s1 = 20;
		System.out.println("b1 = " + b1);
		System.out.println("s1 = " + s1);

		System.out.println("----------");
		// 2. 自动类型转换
		//  byte -> short
		s1 = b1;
		System.out.println("s1 = " + s1);

		System.out.println("----------");
		// 3. 强制类型转换
		//b1 = s1;
		s1 = 128;	// 超过byte范围，数据会有损失
		b1 = (byte)s1;
		System.out.println("b1 = " + b1);
	}
}
