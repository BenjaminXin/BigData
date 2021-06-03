/*
 * 关系运算符应用
 */

public class RelationTest {

	public static void main(String[] args) {

		// 1. 声明两个int变量，初始化
		int ia = 5;
		int ib = 2;
		
		// 2. 关系运算符，输出结果
		boolean b1 = ia > ib;
		System.out.println("b1 = " + b1);
		System.out.println(ia > ib);
		System.out.println(ia >= ib);
		System.out.println(ia < ib);
		System.out.println(ia <= ib);
		System.out.println(ia == ib);
		System.out.println(ia != ib);
	}
}
