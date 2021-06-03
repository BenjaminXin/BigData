/*
 * 整数类型的使用
 */


public class IntTest {

	public static void main(String[] args) {

		// 1. 声明一个byte类型的变量，初始化
		byte b1 = 25;
		//byte b1 = 250; // 不兼容的类型，从int转换到byte可能会损失。(超过byte的整数范围)
		// 2. 打印变量的数值
		System.out.println("b1 = " + b1);	// b1 = 25

		System.out.println("----------");	
		// 3. 声明一个short变量，初始化
		short s1 = 250;
		System.out.println("s1 = " + s1);	// s1 = 250

		System.out.println("----------");
		// 4. 声明一个int类型的变量，初试化
		int i1 = 250250;

		//int i1 = 250250250250;	//错误：过大的整数。默认的整数类型是int，不存在隐式类型转换
		// 一个long类型的整数，赋值给int类型，会有类型不兼容，long转换到int，数值损失的错误
		//int i1 = 250250250250L;

		System.out.println("i1 = " + i1);	// i1 = 250250

		System.out.println("----------");
		//5. 声明一个long类型的整数变量，初始化
		long g1 = 250250250250L;
		System.out.println("g1 = " + g1);	// g1 = 250250250250

		// 更大的数，使用java.math.BigInterger类型
	}
}



