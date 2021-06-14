/*
 * Boy 类
 */


public class Boy {



	String name;

	// 构造方法
	Boy() {
		this("Tom");
		System.out.println("constructor without args");
	}

	Boy(String name) {
		System.out.println("constructor with args");
		this.name = name;
	}

	void show() {
		System.out.println("name = " + name);
	}


	public static void main(String[] args) {

		// 1. 使用无参方式构造对象, 并输出
		Boy b1 = new Boy();
		b1.show();

		System.out.println("----------");
		// 2. 使用有参方式构造对象
		Boy b2 = new Boy("Benjamin");
		b2.show();

		System.out.println("----------");
		Boy b3 = null;
		b3.show();
	}
}
