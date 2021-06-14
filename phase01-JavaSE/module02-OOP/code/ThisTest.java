/*
 * this 关键字
 */


public class ThisTest {

	// 自定义构造方法
	ThisTest() {
		System.out.println("constructor: this = " + this);
	}

	// 成员方法
	void show() {
		System.out.println("show() method: this = " + this);
	}

	public static void main(String[] args) {
		
		// 1. 实例化对象
		ThisTest tt = new ThisTest();
		System.out.println("main(): tt = " + tt);
		// 2. 调用show() method
		tt.show();
		// 3. 
	}
}
