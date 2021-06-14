/**
 * 
 */


public class AnonymousInterfaceTest {

	// 如何调用该方法
	// AnonymounsInterface ai = new AnonymoustInterfaceImpl()
	// 接口类型的引用，指向实现类的对象，多态
	public static void test(AnonymousInterface ai) {
		ai.show();
	}

	public static void main(String[] args) {

		// 调用
		AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());

		System.out.println("----------");
		// 使用匿名内部类
		AnonymousInterface ait = new AnonymousInterface() {
			@Override
			public void show() {
				System.out.println("匿名类实现接口类");
			}
		};

		AnonymousInterface ait2 = () -> {
			System.out.println("lambda 表达实现接口类");
		};

		AnonymousInterfaceTest.test(ait);
		AnonymousInterfaceTest.test(ait2);
		
		
	}

}
