/*
 * DogTest 类
 */


public class DogTest {

	public static void main(String[] args) {

		// 1. 无参构造Dog类的实例化对象
		Dog d1 = new Dog();
		d1.show();

		System.out.println("---------");
		// 2. 有参构造Dog类的实例化对象
		//Dog d2 = new Dog("pickle", "gold and brown", 25);
		Dog d2 = new Dog("pickle", "gold and brown", -25);
		d2.show();
	}
}
