/*
 * 算数运算符
 */


public class ArithmeticTest {

	public static void main(String[] args) {

		// 1. 声明两个int类型的变量，初始化
		//int ia = 6, ib = 2;
		int ia = 6;
		int ib = 2;
		System.out.println("ia = " + ia);
		System.out.println("ib = " + ib);

		// 2. 算数运算
		int ic = ia + ib;
		System.out.println("ic = " + ic);
		System.out.println(ia + ib);
		System.out.println(ia - ib);
		System.out.println(ia * ib);
		System.out.println(ia / ib);
		System.out.println(ia % ib);

		// 3. 注意事项
		//  当两个整数相除时，只保留整数部分
		//  要保留小数部分，至少有一个操作数不是整数
		System.out.println(ia / (double)ib);

		//  也可以任一操作数乘以1.0
		System.out.println(5 * 1.0 / 2);
		
		//  0 不能做除数, 编译时不会报错，但是运行时会报错
		//System.out.println(5 / 0);
		System.out.println(5 / 0.0);	// Infinity
		System.out.println(0 / 0.0);	// NaN (Not a Number)

		
	}
}
