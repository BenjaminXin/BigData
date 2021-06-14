/**
 * 局部内部类
 */


public class AreaOuter {

	private int cnt = 1;

	public void show() {

		// 定义局部内部类, 只作用于当前方法体
		class AreaInner {
			private int ia = 1;
			
			public AreaInner () {

				System.out.println("AreaInner's contructor");
			}

			public void test() {
				System.out.println("ia: " + ia);
				System.out.println("cnt: " + cnt);
			}
		}
		
		// 声明局部内部类的引用，指向局部内部类的实例化对象
		AreaInner ai = new AreaInner();
		ai.test();
	}

}
