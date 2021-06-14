/*
 * PeopleTest 类
 */

public class PeopleTest {

	public static void main(String[] args) {

		// 4. 验证static关键字修饰的静态成员变量与创建对象无关
		System.out.println("country: " + People.country);

		// 1. 构造两个对象
		People p1 = new People("Tom", 25, "Korea");
		People p2 = new People("Benjamin", 25, "China");

		// 2. 输出
		p1.show();
		p2.show();

		System.out.println("----------");
		// 3. 验证static 关键字修饰的静态成员，是否被所有实例化对象共享
		p1.country = "ph";
		System.out.println("p1 country: " + p1.getCountry());
		System.out.println("p2 country: " + p2.getCountry());
	}
}
