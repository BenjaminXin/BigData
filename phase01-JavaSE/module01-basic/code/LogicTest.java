/*
 * 逻辑运算
 */


public class LogicTest {

	public static void main(String[] args) {

		// 1. 声明两个boolean类型变量，初始化
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);

		System.out.println("----------");
		// 2. 逻辑运算
		boolean b3 = b1 && b2;
		System.out.println("b3 = " + b3);
		System.out.println(b1 || b2);
		System.out.println(! b1);
		System.out.println(! b2);

		System.out.println("----------");
		// 3. 逻辑运算的短路特性
		//  逻辑运算存在只判断条件一就能输出结果的情况
		int ia = 3;
		int ib = 5;
		// (++ib == 5) 不会执行，因为与运算其条件一已经为假
		boolean b4 = (++ia == 3) && (++ib == 5);
		System.out.println("b4 = " + b4);
		System.out.println("ia = " + ib);
		System.out.println("ib = " + ib);

		// (++ib == 5) 不会执行，因为或运算其条件一已经为真
		boolean b5 = (++ia == 5) || (++ib == 5);
		System.out.println("b5 = " + b5);
		System.out.println("ia = " + ib);
		System.out.println("ib = " + ib);	
	}
}
