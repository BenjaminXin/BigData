/*
 * Singleton
 */


public class Singleton {
	
	//private static Singleton sin = new Singleton();
	private static Singleton sin = new Singleton();

	// 私有化构造方法, 切断外部实例化对象的机会
	private Singleton() {}


	// 3. 提供公有的get方法
	// static 修饰，是因为单例模式下，无法通过对象访问到方法
	// 需要将方法通过static “加载”到类上，通过 类.方法 的模式访问
	public static Singleton getInstance() {
		return sin;
	}
}
