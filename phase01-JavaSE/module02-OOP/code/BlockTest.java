/*
 * 构造块和静态代码块
 */


public class BlockTest {

	{
		System.out.println("构造块");
	}

	static {
		System.out.println("静态代码块");
	}


	// 自定义构造方法
	//public BlockTest() {
	BlockTest() {
		System.out.println("构造方法");
	}

	public static void main(String[] args) {

		BlockTest bt = new BlockTest();
		System.out.println("----------");
		BlockTest bt2 = new BlockTest();
	}
}
