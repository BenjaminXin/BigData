/*
 * 单例模式练习
 */


public class Singleton2 {

	// 2. 声明该类类型的引用变量，指向该类类型的对象
	// private 切断外部的访问，static 规范单一对象
	private static Singleton2 sin = new Singleton2();
	
	// 1. 私有化构造函数，切断外部通过 new 创建对象
	private Singleton2() {}

	// 3. 公有的get方法，return创建好的对象
	// public 允许外部访问
	// static 单一对象
	public static Singleton2 getInstance() {
		return sin;
	}

}
