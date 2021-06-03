/*
 * 自增自减
 */

 
public class SelfTest {

	public static void main(String[] args) {

		// 1. 声明一个int类型的变量，初始化
		int ia = 10;
		System.out.println("ia = " + ia);

		System.out.println("----------");
		// 2. 自增
		ia ++;
		System.out.println("ia = " + ia);
		++ ia;
		System.out.println("ia = " + ia);

		// 3. 自减
		ia --;
		System.out.println("ia = " + ia);
		-- ia;
		System.out.println("ia = " + ia);

		System.out.println("----------");
		// 4. ia++是表达式，ia是操作数/变量，二者所占的空间不同 
		//  ++ 在前，先自增，再作为表达式的结果
		//  ++ 在后，先以ia的数值作为表达式的结果，再自增
		System.out.println(ia++);
		System.out.println("ia = " + ia);
		System.out.println(++ia);
		System.out.println("ia = " + ia);

		System.out.println("----------");
		// 5. 笔试考点
		int ib = ia ++;
		System.out.println("ib = " + ib);
		System.out.println("ia = " + ia);
		int ic = ++ ia;
		System.out.println("ic = " + ic);
		System.out.println("ia = " + ia);

		System.out.println("----------");
		//
		System.out.println(ia++ + ++ia);
		System.out.println("ia = " + ia);

	}
}
