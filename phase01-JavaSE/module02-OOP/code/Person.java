/*
 * Person 类的定义, 封装
 */


public class Person {

	// 1. 私有化成员变量
	private String name;
	private int age;

	// 3. 在构造方法中，调用set方法进行合理值判断
	public Person() {
		System.out.println("Person's non-args constructor");
	}
	
	public Person(String name, int age) {
		System.out.println("Person's with-args constructor");
		setName(name);
		setAge(age);
	}

	// 2. 公有的getter 和 setter，并进行合理值判断
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) { 
		if(age > 0 && age < 150) { 
			this.age = age;
		} else {
			System.out.println("age is out of range...");
		}
	}

	//  输出对象特征的方法
	void show() {
		System.out.println("name = " + getName());
		System.out.println("age = " + getAge());
	}

	// 自定义成员方法，描述 吃饭 的行为
	public void eat(String food) {
		System.out.println(food + " pretty well");
	}

	// 自定义成员方法，描述 吃饭 的行为
	public void play(String game) {
		System.out.println(game + " pretty funny");
	}


	// 可变长参数
	void showArgument(String... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("第 " + (i+1) + " 个参数：" + args[i]);
		}
	}


	public static void main(String[] args) {

		// 类实例化为对象
		Person p = new Person("Benjamin", 25);
		// 成员变量赋值
		// 输出成员变量值
		p.show();

		System.out.println("----------");
		p.show();

		p.showArgument();
		p.showArgument("this");
		p.showArgument("end", "over");

		System.out.println("----------");
		Person p3 = new Person();
		p3.show();
	}
}
