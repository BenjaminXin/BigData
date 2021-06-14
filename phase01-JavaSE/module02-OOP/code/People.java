/*
 * People 类
 */

public class People {

	private String name;
	private int age;
	//private String country;
	public static String country;	 

	People() {
	}

	People(String name, int age, String country) {
		this.setter(name, age, country);
	}

	public void setter (String name, int age, String country) {

		this.name = name;
		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			System.out.println("age is out of range...");
		}
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getCountry() {
		return this.country;
	}
	
	void show() {
		System.out.println("name: " + this.getName());
		System.out.println("age: " + this.getAge());
		System.out.println("country: " + this.getCountry());
	}
}	
