/*
 * 赋值运算符，复合赋值运算符
 */


public class AssignTest {

	public static void main(String[] args) {

		// 1. 声明一个int类型变量，初始化
		int ia = 3;
		System.out.println("ia = " + ia);

		System.out.println("----------");
		// 2. 简单赋值运算符
		//  将数据5赋值给变量ia，并覆盖原ia的值
		ia = 5;
		System.out.println("ia = " + ia);

		System.out.println("----------");
		//
		int ib = ia = 6;
		System.out.println("ia = " + ia);
		System.out.println("ib = " + ib);

		System.out.println("----------");
		// 3. 复合赋值运算符
		ia += 2;
		System.out.println("ia = " + ia);
		
		System.out.println("----------");
		// 4. 考点1 -  
		byte b1 = 10;
		System.out.println("b1 = " + b1);

		//b1 = b1 + 2;	// 报错，byte + int，类型不兼容
		//b1 = b1 + (byte)2;	// 报错，byte + int，类型不兼容
		// 因为编译器自动将byte的操作数转换为int类型
		b1 = (byte)(b1 + 2);	// 报错，byte + int，类型不兼容
		System.out.println("b1 = " + b1);
		b1 += 2;	
		System.out.println("b1 = " + b1);

		System.out.println("----------");
		// 5. 考点2 - 
		// ia == 2; 表示ia的数值是否等于2
		// 2 == ia; 表示2 是否等于 ia的值
		// ia = 2;  表示2 赋值给ia
		// 2 = ia； 报错
	}
}
