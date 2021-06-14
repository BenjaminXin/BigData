/**
 * NormalOuter class test
 */


public class NormalOuterTest {

	public static void main(String[] args) {
		
		// 1. 声明NormalOuter类的引用，指向该类型的对象
		NormalOuter no = new NormalOuter();

		// 2. 声明NormalOuter类中内部类的引用，指向内部类对象
		NormalOuter.NormalInner ni = no.new NormalInner();

		// 3. 调用内部类的show方法
		ni.show();
	}
}
