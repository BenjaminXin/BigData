/*
 * Shape class
 */


public class Shape {

	private double x;
	private double y;

	{
		this.x = 0;
		this.y = 0;
	}
	
	Shape() {}

	Shape(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void show() {
		System.out.println("x: " + getX());
		System.out.println("y: " + getY());
	}

	// 自定义静态方法
	public static void test () {
		System.out.println("Shape class's static method...");
	}
}
