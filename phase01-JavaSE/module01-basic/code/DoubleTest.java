/*
 * 浮点类型的使用
 */


public class DoubleTest {

	public static void main(String[] args) {

		// 1. 声明一个float类型的变量，初始化
		//float f1 = 3.1415926;	// 报错：不兼容的类型

		// 将数据声明为float类型
		float f1 = 3.1415926f;
		System.out.println("f1 = " + f1);	// f1 = 3.1415925 只能显示7位有效数字
		
		// 3. 声明一个double类型的变量，初始化
		double d1 = 3.1415926;
		System.out.println("d1 = " + d1);

		// 4. 笔试考点
		System.out.println(0.1 + 0.2);	// 0.30000000000000004
		// 浮点数类型运算会有误差
		// 若需要精确运算，需要使用java.math.BigDecimal类型
	}
}
