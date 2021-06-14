/**
 * 静态内部类
 */

public class StaticOuter {

	private int cnt =1;	// 对象层级
	private static int snt = 2;	// 类层级
	
	/**
	 *
	 */
	public static class StaticInner {

		private int ia = 3;

		private static int snt = 4;
		
		public StaticInner() {
			System.out.println("static inner class's constructor");
		}

		public void show() {

			System.out.println("ia: " + ia);
			System.out.println("snt: " + StaticOuter.snt);	// 可以访问snt，因为snt是静态成员
			// 不能访问非静态成员，因为是静态的类

			System.out.println("snt: " + StaticInner.snt);  // 内部类的成员
		}
	}
	
}
