/*
 * Student 类
 */


public class Student {

	private int id;
	private String name;

	Student() {
	}

	Student(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	int getId() {
		return this.id;
	}

	String getName() {
		return this.name;
	}

	void show() {
		System.out.println("id: " + id + " name: " + name);
	}

}
