/*
 * 参数传递
 */


public class ArgumentTest {

	// 自定义成员方法，输出参数传入的整数数据
	void show1(int ia) {
		ia = 200;
		System.out.println("ia = " + ia);
	}


	void show2(int[] arr1) {
		arr1 = new int[2];	// 申请一块新的内存空间, 但是参数数据不见
		arr1[0] = 200;
		System.out.println("arr = " + arr1[0]);
		System.out.println("arr = " + arr1[1]);
	}



	public static void main(String[] args) {

		// 1. ArgumentTest 类的实例化
		ArgumentTest argumenttest = new ArgumentTest();
		// 2. show1方法
		int ib = 10;
		argumenttest.show1(ib);
		System.out.println("ib = " + ib);

		System.out.println("----------");
		int[] arr2 = new int[] {10, 20};
		argumenttest.show2(arr2);
		System.out.println("main arr2 = " + arr2[0]);
		System.out.println("main arr2 = " + arr2[1]);
	}
}
