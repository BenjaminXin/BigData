/*
 * Dog 类
 */

public class Dog extends Animal {

	private int teethNumber;

	Dog () {}

	Dog (String name, String color, int teethNumber) {
		super(name, color);
		setTeethNumber(teethNumber);
	}

	public int getTeethNumber() {
		return teethNumber;
	}

	public void setTeethNumber(int teethNumber) {
		if (teethNumber > 0) {
			this.teethNumber = teethNumber;
		} else {
			System.out.println("teeth number is out of range...");
		}
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("number of teeth: " + this.getTeethNumber());
	}
}
