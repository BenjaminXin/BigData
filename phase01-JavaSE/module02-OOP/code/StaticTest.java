/*
 * static 关键字的使用
 */


public class StaticTest {

	private int cnt = 1;
	private static int snt = 2;
	
	// 非静态成员方法
	public void show() {
		System.out.println("cnt = " + cnt);
		System.out.println("snt = " + snt);
	}

	// 静态成员方法，引用方式：类名.方法名
	public static void test() {
		System.out.println("cnt = " + this.cnt);
		System.out.println("snt = " + this.snt);
	}


	public static void main(String[] args) {

		// 1. 测试
		StaticTest st = new StaticTest();
		st.show();
	}
}
