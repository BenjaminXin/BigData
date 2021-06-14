/*
 * overload
 */


public class OverloadTest {

	void show() {
		System.out.println("this is show() method");
	}
	
	// 重名方法
	void show(int i) {
		System.out.println("overload show() method, arg is " + i);
	}

	void show(int i, double b) {
		System.out.println("overload show() method, arg is " + i + ", " + b);
	}

	int show(int i, double b) {
		System.out.println("overload show() method, arg is " + i + ", " + b);
	}

	public static void main(String[] args) {

		// 1. 实例化对象
		OverloadTest ot = new OverloadTest();
		// 2. 调用show 方法
		ot.show();
		// 3. overload show() method
		ot.show(7);
	}
}
