/*
 * Animal 类
 */


public class Animal {

	private String name;
	private String color;

	Animal() {}
	
	Animal(String name, String color) {
		setName(name);
		setColor(color);
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println("name: " + getName());
		System.out.println("color: " + getColor());
	}
}
