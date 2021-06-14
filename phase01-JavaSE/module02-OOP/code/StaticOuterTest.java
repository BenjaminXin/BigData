/**
 * 静态内部类的测试
 */


public class StaticOuterTest {


	public static void main(String[] args) {

		// 1. 因为静态内部类，可以由外部类直接访问，所以不需要声明外部类的引用
		//  直接声明静态内部类的引用
		StaticOuter.StaticInner si = new StaticOuter.StaticInner();
		
		// 2. 调用show方法
		si.show();
	}
}
