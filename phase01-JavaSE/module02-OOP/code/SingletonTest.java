/*
 * SingletonTest
 */


public class SingletonTest {

	public static void main(String[] args) {
		
		// 1. Singleton类实例化
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		//System.out.println(s1 == s2);
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);

		System.out.println("----------");
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		System.out.println(s3 == s4);

	}
}
