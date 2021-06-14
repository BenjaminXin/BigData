/*
 * Rect class
 */


public class Rect extends Shape {

	private int length;
	private int width;

	Rect() {}
	
	Rect(double x, double y, int length, int width) {
		super(x, y);
		setLength(length);
		setWidth(width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if(length > 0) {
			this.length = length;
		} else {
			System.out.println("length is out of range...");
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width > 0) {
			this.width = width;
		} else {
			System.out.println("width is out of range...");
		}
	}

	@Override
	public void show() {
		super.show();
		System.out.println("length: " + getLength());
		System.out.println("width: " + getWidth());
	}

	public static void test() {
		System.out.println("Rect class's static method...");
	}
}
