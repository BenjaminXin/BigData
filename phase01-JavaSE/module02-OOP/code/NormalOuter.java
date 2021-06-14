/**
 * 外部类 和 内部类
 */


public class NormalOuter {

	private int cnt = 1;
	
	// 普通内部类
	public class NormalInner {
		
		private int ia = 2;
		private int cnt = 3;
		
		public NormalInner () {
			System.out.println("normal inner's constructor");
		}

		public final void show() {
			System.out.println("cnt: " + NormalOuter.this.cnt);
			System.out.println("ia: " + ia);
			System.out.println("cnt: " + this.cnt);
		}
	}

}
