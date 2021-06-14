/**
 * 
 */


public class AreaOuterTest {

	public static void main(String[] args) {

		// 1. 实例化外部类对象
		AreaOuter ao = new AreaOuter();
		
		// 2. 调用show方法，执行方法内，对局部内部类的实例化和内部类的方法
		ao.show();
	}
}
